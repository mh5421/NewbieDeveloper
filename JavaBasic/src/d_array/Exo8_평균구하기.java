package d_array;

import java.util.*;
public class Exo8_평균구하기 {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("몇번 테스트 하실건가요?");
		int n=Input.nextInt();
		

		double avg = 0;
		int text[][]=new int[n][(int) (Math.random()*1000)+1];
		int total[] = new int[n];
		
		for(int i=0;i<text.length;i++) {
			int over=0;
			for(int j=0;j<text[i].length;j++) {
				text[i][j]=(int)(Math.random()*101);


				total[i]+=text[i][j];	

			}	
			avg=(double)total[i]/text[i].length;
			for(int j=0;j<text[i].length;j++) {
				if(text[i][j]>(int)avg) {
					over++;

				}
			}
			
			
			System.out.println(Math.round(((double)over*100)/text[i].length*1000)/1000.0+"%");
		}
		
		
		
		

	}

}
