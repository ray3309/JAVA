package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ex1_ReadCSV {

	// 메인함수 보다 먼저 호출이 되게 하기 위해 static 영역에서 드라이버 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static ArrayList<FreeBoardVO> arr = new ArrayList<FreeBoardVO>();
	
	public ArrayList<FreeBoardVO> readCsv() {
		try (BufferedReader br = new BufferedReader(new FileReader("src/ex1/freeboard.csv"))) {

			String line = null;
			br.readLine(); // 첫라인은 제외

			// , 기준으로 배열에 저장
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				int num = Integer.parseInt(data[0]);
				String title = data[1];
				String writer = data[2];
				String conts = data[3];
				String pwd = data[4];
				int hit = Integer.parseInt(data[5]);
				String date = data[6].toString();

				FreeBoardVO vo = new FreeBoardVO(num, title, writer, conts, pwd, hit, date);
				arr.add(vo);
				// System.out.println(line);
			}
			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			return arr;
		}
	}

	// batch 처리 : 입력을 배치해서 한번에 처리 하는 개념
	// JDBC는 기본이 autocommit이고, 이를 개발자가 제어
	// addBatch()를 사용해서 배치처리

	public void myAddBatch(ArrayList<FreeBoardVO> fbvo) {
		// DB Url 변수
		String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
		String user = "ray3309";
		String pwd = "yhs8281";
		String sql = "INSERT INTO freeboard VALUES (freeboard_seq.nextVal, ?, ?, ?, ?, ?, ?)";

		// 1. Connection 선언
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			// autocommit을 해제
			conn.setAutoCommit(false);
			try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
				for (FreeBoardVO e : fbvo) {
//					if (e.getTitle().contains("안녕4")) {
//						throw new SQLException("안녕4 일때 예외 발생");
//					}

					// 데이터 바인딩
					pstmt.setString(1, e.getTitle());
					pstmt.setString(2, e.getWriter());
					pstmt.setString(3, e.getConts());
					pstmt.setString(4, e.getPwd());
					pstmt.setInt(5, e.getHit());
					pstmt.setString(6, e.getDate());

					// 배치 메모리에 Stack
					pstmt.addBatch();
				}
				int[] result_state = pstmt.executeBatch();

				// 완료가 되면 autocommit은 해제 시켜놨으니, 다시 커밋 시켜줘야 함
				conn.commit();
				System.out.println(result_state.length + "건이 배치 처리 되었습니다.");
				System.out.println("Conn:" + conn);

			} catch (SQLException e) {
				e.printStackTrace();
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Ex1_ReadCSV ref = new Ex1_ReadCSV();
		ArrayList<FreeBoardVO> vo2 = ref.readCsv();

		/*
		 * int nLoop = 1; for (FreeBoardVO freeBoardVO : vo2) { System.out.println(nLoop
		 * + " 번의 데이터 " + ", title : " + freeBoardVO.getTitle() + ", Writer : " +
		 * freeBoardVO.getWriter() + ", Conts : " + freeBoardVO.getConts() + ", Pwd : "
		 * + freeBoardVO.getPwd() + ", hit = " + freeBoardVO.getHit() + ", Date : " +
		 * freeBoardVO.getDate()); nLoop += 1; }
		 */
		
		ref.myAddBatch(vo2);
	}

}
