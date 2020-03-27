package c_control;

import java.util.*;
public class Ex07_break_continue {

	public static void main(String[] args) {
		
		HERE:
		for(int i = 0;i<2;i++) {
			for(int j =0; j<3; j++) {
				//if(j==1)break HERE; //HERE 라벨과 가장 가까운 for문을 빠져나간다.
				if(j==1)continue HERE;
				System.out.printf("%d, %d \n",i,j );
			}
			System.out.println("자고싶다");
			
			
		}
		

	}

}
