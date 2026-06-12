package ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex3_BridgeStream {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		// InputStreamReader == bridgeStream
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			System.out.println("입력:");
			String msg = br.readLine();
			System.out.println(msg);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
