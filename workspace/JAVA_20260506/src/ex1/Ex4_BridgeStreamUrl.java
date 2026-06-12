package ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class Ex4_BridgeStreamUrl {
	public static void main(String[] args) throws Exception  {
		String url = "https://ictedu.co.kr/index_new.php?main_page=teacher&place=";		
		URL OpenUrl = (new URI(url)).toURL();
		
		InputStream is = OpenUrl.openStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String readV = null;
		while((readV = br.readLine()) != null){
			System.out.println(readV);
		}
	
		br.close();
		is.close();		
	}
	
}
