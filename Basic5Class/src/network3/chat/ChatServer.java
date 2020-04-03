package network3.chat;

import java.io.*;
import java.util.*;
import java.net.*;

public class ChatServer implements Runnable {
	ArrayList vc = new ArrayList();

	public void run() {
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(1234);
		}catch( Exception e ) {
			System.out.println(e);
		}
		
		while(true) {
			try{
				Socket s = ss.accept();
				System.out.println("Client 가 접속시도 :" + s );
				ChatService cs = new ChatService(s);
				cs.start();
				vc.add(cs);
			
			} catch( Exception e ) { }
		}
	}  // run ends
	
	public static void main( String [] arg ) {
		ChatServer cs = new ChatServer();
		new Thread(cs).start();
	}



class ChatService extends Thread {
		String myname = "quest";
		BufferedReader in;
		OutputStream out;
		ChatService( Socket s ) {
			try{
				in = new BufferedReader( new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch( Exception e ) { }
		}// 생성자 종료
		
	

	public void run() {
		while(true) {
			try{
				String msg = in.readLine();
				if( msg == null ) return;
				StringTokenizer st = new StringTokenizer(msg);
				if( st.countTokens() > 1 ) {
					String temp = st.nextToken();
					
					if( temp.equalsIgnoreCase("/name" )) {
						temp = st.nextToken();
						putMessageAll(myname + "님의 이름이 " + temp + "으로 바뀌었습니다.");
						myname = temp;

						// 추가2: 멤버 목록 추가
						changeList();

						continue;
					}
					
					else if( temp.indexOf(">") == 0 ) {
						String towhom = temp.substring(1);
						temp = st.nextToken();
						putMessageTo( towhom, "(속삭임)" + temp );
						continue;
					}
				
					// 추가	
					// 방에 처음 들어왔을때 멤버들에게 인사
					else if( temp.equalsIgnoreCase("/start" )) {
						myname = st.nextToken();
						putMessageAll(myname + "님이 입장하셨습니다");

						// 추가2: 멤버 목록 보여주기
						changeList();
		
						continue;
					}

					// 추가3: 클라이언트측에서 종료할때
					else if( temp.equalsIgnoreCase("/exit" )) {
						
						putMessageAll(myname + "님이 퇴실하셨습니다");

						// 추가4: 멤버목록에서 제거
						vc.remove(this);						
						changeList();

						continue;
					}
					
				}
				
				putMessageAll( myname + ">" + msg );
			
			}catch( Exception ex ) { return; }
			
		}
	}// run ends
	
	// 추가2: 멤버 목록 보여주기
	void changeList(){
			String msg = "/member  ";
			for( int i =0 ; i<vc.size() ; i++ ) {
				ChatService cs = (ChatService)vc.get(i);
				msg += cs.myname + " ";
			}
			
			putMessageAll( msg ) ; //<-------  여기서 \n을 절대 주면 안됨
			
			
	}

	void putMessageAll( String msg ) {
		for( int i =0 ; i<vc.size() ; i++ ) {
			ChatService cs = ( ChatService ) vc.get(i);
			
			try {
				cs.putMessage(msg);
			}catch( Exception e ) {
				vc.remove(i--);
			}
		}
	} // putMessageAll ends
	
	void putMessageTo( String towhom, String msg ) {
		for( int i=0; i<vc.size() ; i++ ) {
			ChatService cs = ( ChatService ) vc.get(i);
			if( towhom.equalsIgnoreCase( cs.myname )) {
				try{
					cs.putMessage( towhom +">"+ msg);
					break;
				}catch( Exception ex ) { }
			}
		}
	} // putMessageTo ends
	
	void putMessage( String msg )
		throws Exception {
			out.write( (msg+"\r\n").getBytes() );
		}

 } // ChatService class ends
	
	
}// ChatServer class ends
