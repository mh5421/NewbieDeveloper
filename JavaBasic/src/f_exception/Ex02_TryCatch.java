package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
			System.out.println("파일 연결");
			fis.read();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음예외:"+e.getMessage());
			//e.printStackTrace();
		}catch(IOException e) {
			System.out.println("읽을 때 예외 발생");
		}
		catch(Exception e) {//모든 예외를 다 잡는다
			System.out.println("그 외 예외처리");
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

		
		

	}

}
