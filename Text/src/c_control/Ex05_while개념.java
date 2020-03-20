package c_control;
import java.util.*;

public class Ex05_while개념 {
	public static void main(String[] args) {
		
		//1~10까지의 합을 출력
		/*
		int hap = 0;
		int i=1;
		for(; i<=10; ) {
			hap = hap + i; //hap += 1;
			i++;
			
		}
		System.out.println("합:" + hap);
		
		*/
		/*
		Scanner Input = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		int su = Input.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d \n",su,i,su*i);
		}
		int j=1;
		while(j<=9) {
			
			System.out.printf("%d * %d = %d \n",su,j,su*j);
			j++;
		}
		*/
		
		//문장을 입력받아 단어로 나눠서 출력
		// "빨리 코로나 끝났으면 좋겠습니다"
		
		Scanner Input = new Scanner(System.in);
		System.out.println("점수를 입력해주세요(ex. 90/80/70/60)");
		String line=Input.nextLine();
		StringTokenizer st= new StringTokenizer(line,"/"); //문자열을 토큰으로 나누는 클래스
		while(st.hasMoreTokens()) {//hasMoreTokens 함수 실행, 뒤에 토큰이 남아있으면 true 없으면 false값 반환
		
			String temp =st.nextToken();//다음 토큰을 저장
			int su=Integer.parseInt(temp);//String형을 int형으로 치환
			
			System.out.println(++su);
			
			
			
		}

	
	}

}
