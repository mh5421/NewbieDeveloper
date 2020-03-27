package h_inherit4;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Language l = null;

		Scanner Input = new Scanner(System.in);

		do {
			System.out.print("언어를 선택하세요(1.한국어 2.영어 3.일본어):");
			int sel=Input.nextInt();
			switch(sel) {
			case 1:
				l = new Korean();
				break;
			case 2:
				l = new English();
				break;
			case 3:
				l = new Japanese();
				break;
			}
			System.out.print("메시지를 선택하세요(1.인사말 2.자기소개 3.하고픈말):");
			int selectMessage = Input.nextInt();
			switch(selectMessage) {
			case 1:
				l.Hello();
				break;
			case 2:
				l.Introduce();
				break;
			case 3:
				l.Say();
				break;
			}
			System.out.print("다시하시겠습니까?(Y/N)");
		}while(Input.next().charAt(0)!='N');
		System.out.println("프로그램 종료");

	}

}
