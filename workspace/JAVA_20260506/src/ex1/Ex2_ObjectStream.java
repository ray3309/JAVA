package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Serialize / DeSerialize
public class Ex2_ObjectStream {
	String path = "src/ex1/obj.txt";
	public void myWriteObject() {
		MemberVO v = new MemberVO();
		v.setNum(1);
		v.setName("Ray");
		v.setPass("1234");
		v.setAgree(true);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
			
			oos.writeObject(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myReaderObject() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			
			MemberVO v = (MemberVO) ois.readObject();
			System.out.println("No:"+v.getNum());
			System.out.println("Name:"+v.getName());
			System.out.println("Pass:"+v.getPass());
			System.out.println("Agree:"+v.isAgree());			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Ex2_ObjectStream ref = new Ex2_ObjectStream();
		ref.myWriteObject();
		System.out.println("DeSrialize Read");
		ref.myReaderObject();
	}
}
