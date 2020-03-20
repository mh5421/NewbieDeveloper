package d_array;

import java.util.*;

public class Ex05_Looto {
	
	public static void main(String[] args) {
		int lotto[]=new int[6];
		//값대입 -> ## 동일숫자 배제
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
			
		}
		
		
		//정렬
		
		for(int a=lotto.length-1;a>0;a--) {
			for(int b=0;b<a;b++) {
				if(lotto[b]>lotto[b+1]) {
					int temp=lotto[b];
					lotto[b]=lotto[b+1];
					lotto[b+1]=temp;
				}
			}	
		}
		
		
		for(int j=0;j<lotto.length;j++) {
			System.out.print(lotto[j]+"/");
		}
		
		

	}

}
