package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ex2Nsmc {
	String fileUrl = "https://drive.google.com/file/d/1Hm4oxTE2YLTVQXYeHJLj75DTOBXySY-S/view?usp=drive_link";
	String savePath = "src/exam/book.csv";

	String url = "jdbc:oracle:thin:@192.168.0.3:1521:xe";
	String user = "ray3309";
	String dbpwd = "yhs8281";
	
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void downLoad() {

		try (InputStreamReader in = new InputStreamReader(new URI(fileUrl).toURL().openStream());
				BufferedWriter out = new BufferedWriter(new FileWriter(savePath))) {
			int bytesRead;
			while ((bytesRead = in.read()) != -1) {
				System.out.println(bytesRead);
				out.write(bytesRead);
			}
			System.out.println("다운로드 완료: " + savePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<NsmcVO> getCsv() {
		ArrayList<NsmcVO> list = new ArrayList<NsmcVO>();
		try (BufferedReader br = new BufferedReader(new FileReader(savePath));) {

			// 첫 줄 제목 제거 해줘야 한다.
			br.readLine();// 첫 줄은 제거 하는 개념
			// code here

			String bytesRead;
			while ((bytesRead = br.readLine()) != null) {
				System.out.println(bytesRead);
				//String[] data = bytesRead.split("\t");

				//NsmcVO v = new NsmcVO(data[0], data[1], Integer.parseInt(data[2]));
				//list.add(v);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public void addBatch(ArrayList<NsmcVO> list) {
		String sql = "INSERT INTO NAVERBOARD VALUES(naverboard_seq.nextVal,?,?,?)";

		ArrayList<NsmcVO> ar = list;

		// rollback 처리를 하지 않기에 리소스 자동반납 처리를 위해 try~with~resource로 처리
		try(Connection conn = DriverManager.getConnection(url, user, dbpwd);) {
			// autocommit을 해제
			conn.setAutoCommit(false); // 단위처리 할때 이렇게 사용한다. *****
			// -----------------------------------------------------
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

				for (NsmcVO board : ar) {

					pstmt.setString(1, board.getId());
					pstmt.setString(2, board.getDocument());
					pstmt.setInt(3, board.getLabel());

					// 배치 메모리에 차곡차곡 저장
					pstmt.addBatch();
				}
				int[] result = pstmt.executeBatch();
				// 완료 되면 autocommit으로 해제되었으니 여러분이 commit처리
				conn.commit();
				System.out.println(result.length + "건이 배치 처리 되었습니다.");
				System.out.println("Conn:" + conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// -----------------------------------------------------
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ex2Nsmc re = new Ex2Nsmc();
		re.downLoad();
		ArrayList<NsmcVO> rArr = re.getCsv();
		re.addBatch(rArr);
	}

}
