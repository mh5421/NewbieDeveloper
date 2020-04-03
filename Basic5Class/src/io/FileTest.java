package io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("a.txt");
		
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}else if(f.isDirectory()) {
			System.out.println("디렉토리입니다.");
			String sub[] = f.list();
			for(String m : sub) {
				System.out.println(m);
			}
		}
		f.delete();

	}

}
