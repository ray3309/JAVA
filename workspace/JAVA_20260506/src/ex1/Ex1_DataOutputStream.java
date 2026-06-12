package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataIn/OutputStream

public class Ex1_DataOutputStream {
	private String spath;
	
	public Ex1_DataOutputStream() {
		// TODO Auto-generated constructor stub
		spath = "src/ex1/dataObj.txt";
	}
	
	public void dataWrite() {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(spath))) {
			// 입력 순서 중요
			dos.writeInt(10);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeFloat(10.5F);
			dos.writeUTF("MyTest");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dataReader_Worng() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(spath))) {
			System.out.println("출력 :-------------------------");
			System.out.println("String:" + dis.readUTF());
			System.out.println("boolean:" + dis.readBoolean());
			System.out.println("char:" + dis.readChar());
			
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
	}
	
	public void dataReader_Correct() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(spath))) {
			System.out.println("출력 :-------------------------");
			
			System.out.println("Integer:" + dis.readInt());
			System.out.println("Boolean:" + dis.readBoolean());						
			System.out.println("Char:" + dis.readChar());
			System.out.println("Flot:" + dis.readFloat());
			System.out.println("String:" + dis.readUTF());
			
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ex1_DataOutputStream dos = new Ex1_DataOutputStream();
		System.out.println("파일 기록중");
		dos.dataWrite();
		System.out.println("파일 기록 완료");
		System.out.println("-------------------------");
		
		System.out.println("파일을 기록 순서에 상관없이 읽는중");
		dos.dataReader_Worng();
		System.out.println("파일을 기록 순서에 상관없이 읽기 완료");
		
		System.out.println("-------------------------");
		
		System.out.println("파일을 기록 순서에 맞게 읽는중");
		dos.dataReader_Correct();
		System.out.println("파일을기록 순서에 맞게 읽기 완료");
		
		System.out.println("-------------------------");
	}
}
