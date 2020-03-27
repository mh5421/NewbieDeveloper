package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
		readFile();
		System.out.println("파일 처리 성공");
		}catch(Exception e) {
			System.out.println("실패");
		}
	}
	static void readFile() throws Exception{
		FileInputStream fis = new FileInputStream("data1.txt");
		System.out.println("파일 연결");
	}

}
