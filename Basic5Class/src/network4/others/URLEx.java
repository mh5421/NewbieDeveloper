package network4.others;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) {
		
		try{
			URL url = new URL("http://en.wikipedia.org/w/index.php?title=Special%3ASearch&profile=default&search=korea&fulltext=Search");
			
			System.out.println("호스트명과 포트 : " + url.getAuthority() );
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트명 : " + url.getHost());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("경로 : " + url.getPath());
			System.out.println("파일 : " + url.getFile());
			System.out.println("쿼리 : " + url.getQuery());
			System.out.println("참조 : " + url.getRef());
			
		}catch( Exception ex){
			System.out.println("해당 호스트에 연결할 수 없습니다. " + ex.getMessage());
		}
	}
}
