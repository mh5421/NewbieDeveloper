package io.bytestreamarray;

/*
	======================================================
	InputStream을 구현한 FileInputStream을 이용한 예
	======================================================
	
	@ int read( byte[] data )
		` 한번에 한 바이트만 읽는 것이 비효율적이기 여러 개의 바이트를 읽어 들임
		` 읽은 바이트 수를 리턴	
		
		` 더이상 읽을 바이트가 없으면 -1 리턴
		  ( -1은 배열에 저장되지 않는다 )
	
	
	
	@ int read( byte[] data, int offset, int length )
	
	[ 참고 ] 주의할 점
		` 네트워크에서 1024 바이트를 읽을려고 시도했지만 실제로 512바이트만 읽고
		나머지는 수신중인 경우, 나중에 모두 도착하겠지만 현재는 사용할수 없는 데이타가 된다
		
		int read = 0;
		int bytesToRead = 1024;
		byte [] data = new byte[ bytesToRead ];
		while ( read < bytesToRead )
		{
			read += in.read( data, read, bytesToRead - read );	
		}
	
	
		` 스트림은 닫히지 않았지만 읽을 데이타 없으면 -1이 아니라 0을 리턴한다
		  ( 이런 경우 프로그램은 실행되지 않고 블럭된다 )
		  
		  
	
	[ 참고 ] available()
	
		` 읽을 수 있는 바이트 수 리턴하여 읽을 수 있는 바이트가 준비되지 않았을 때
		읽기를 멈추고 싶을 경우에 사용한다
	
		` read( byte[] data, int offset, int length )에서 length가 0이면 
		스트림의 끝을 모르기에 -1이 아닌 0을 리턴하므로 이런 경우 사용한다
		
	
	
*/

import java.io.FileInputStream;
import java.io.IOException;

public class InputTestSecond
{
	public static void main( String args[] ) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("b.txt");
			byte [] data = new byte[1024]; //몇개를 받을지 몰라서 공간을 많이 확보해놓는다. 배열의 단점
			
			int count = fis.read(data); //준비한 배열을 인자로 넣어주면 배열을 채워달라는 명령어 
			for(int i=0;i<count;i++) {
				System.out.println(data[i]);
			}
			
		}catch( Exception ex ){
			System.out.println("파일전송실패 :" + ex.toString() );
		}
	}	
}

/*
	======================================
		결과 출력
	======================================

	` 숫자만 나오는데, 우선 열개만 읽어서 숫자 자체로 출력하고
	나머지는 읽어서 (char) 형변환 하면 문자로 출력될 것이
*/