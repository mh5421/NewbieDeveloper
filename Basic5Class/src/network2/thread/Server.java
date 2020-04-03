package network2.thread;

import java.io.*;
import java.net.*;

public  class Server extends Thread {
	
	public static final int PORT = 3333;
	protected ServerSocket listen;
	
	public Server() {
		try{
			listen = new ServerSocket( PORT );
			System.out.println("Server started..");
		} catch( IOException ex ) {
			System.out.println("Creating the ServerSocket.." + ex );	
		}	
		this.start();		
	}	
	
	// 요청이 들어올 때마다 연결 상태를 새로이 생성
	public void run() {
		try{
			while( true){
					Socket client = listen.accept(); //클라이언트가 들어오길 기다리고 연결되면 소켓 생성
					JuryThread cc = new JuryThread( client );	
					System.out.println("클라이언트 입장 : " + client );
			}
		} catch( IOException ex ) {
			System.out.println("Creating the Socket.." +  ex );	
		}	
	}
	
	public static void main( String args[] )  {
		new Server();	
	}	
}

class JuryThread extends Thread{
	Socket client;
	DataInputStream in;
	DataOutputStream out;
	
	public JuryThread( Socket s ) {
		client	= s;
		try {
			in = new DataInputStream( client.getInputStream());
			out = new DataOutputStream( client.getOutputStream());
		} catch ( IOException ex ) {
			try{
					client.close();	
			} catch ( IOException exc ) {
					System.out.println("Error getting socket stream : " + exc );
			}	
			return;
		}	
		
		this.start();		
	}	
	
	public void run() {
		
		/*******************************************
		* 클라이언트로부터 데이타를 읽어옴
		*/
		int a[] = new int [10];
		int b[] = new int [10];
		try{
			for( int i =0 ; i< a.length ; i++ )
				a[i] = in.readInt();
			for( int i =0 ; i< b.length ; i++ )
				b[i] = in.readInt();			 	
		} catch ( Exception ex ){
			ex.printStackTrace();	
		}	
		
		/*******************************************
		* 읽어 온 데이타를 계산
		*/
		int result[] = new int [10];
		for( int i=0 ; i<result.length ; i++ )
			result[i] = a[i] * b[i]+10;
		
		/*******************************************
		* 계산 결과를 다시 클라이언트로 보냄
		*/
		try{
			for( int i=0 ; i<result.length ; i++ )
				out.writeInt( result[i] );
		} catch( Exception ex ) {
			ex.printStackTrace();	
		}

		/*******************************************
		* 닫기
		*/
		try{
			in.close();
			out.close();
			client.close();
		}catch( Exception ex ){

		}
	}	
}