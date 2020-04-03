package network4.others;
import java.net.URL;
import java.io.*;

public class URLContentEx {
	public static void main(String[] args) {
		try{
			
			URL url = new URL("http://www.daum.net");
			BufferedReader  input = new BufferedReader( new InputStreamReader( url.openStream()));
			String line = "";
			while( (line=input.readLine())  != null ) {
				System.out.println( line);
			}
			input.close();
		}catch( Exception ex){
			System.out.println("해당 호스트에 연결할 수 없습니다. " + ex.getMessage());
		}

	}
}
