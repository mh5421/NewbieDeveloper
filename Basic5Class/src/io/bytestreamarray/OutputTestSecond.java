package io.bytestreamarray;

/*
	===========================================================
	OuputStream을 구현한 FileOutputStream을 이용한 예제
	===========================================================


	@ write( int data )
		` 한번에 한 바이트(8bit) 정도는 비효율
		
		` 데이타 전송시 TCP 프로토콜을 주로 사용하는데, 이더넷 카드에서
		외부로 나가는 모든 TCP 세그먼트에는 라우팅, 에러정정의 위한 
		헤더 정보가 40byte 정도 붙는다
		
	
	@ write( byte[] data )
		` 한 바이트씩 보다는 배열을 한번에 전송하는 것이 효율
		
	@ write( byte[] data, int offset, int length )
	
	
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTestSecond
{
	public static void main( String args[] ) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("b.txt");
	
			int 	numCount = 10;
			int		charCount = 26;
			int 	i = 0;
			byte [] data = new byte[numCount + charCount];
			
			for( i=0; i < numCount; i++)
			{
				data[i] = (byte)i;
			}
			
			for( int ch = 'A'; ch <= 'Z'; ch++, i++)
			{
				data[i] = (byte)ch;
			}
				
			fos.write(data);
			fos.close();
			
		}catch( IOException ex ){
			System.out.println("파일전송실패 :" + ex.toString() );
		}
	}	
}