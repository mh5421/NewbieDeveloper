package d_array;

import java.util.*;

public class Ex05_Looto2 {

	public static void main(String[] args) {
		int lotto[][]=new int[5][6]; //5행6열 2차원배열 선언
		//값대입 -> ## 동일숫자 배제
		for(int i=0;i<lotto.length;i++) {//행의길이 만큼 반복하는 반복문
			for(int j=0;j<lotto[i].length;j++) {//열의 길이만큼 반복하는 반복문
				lotto[i][j]= (int)(Math.random()*45)+1; //i행 j열에 1~45사이의 숫자를 랜덤으로 저장
				for(int k=0; k<j;k++) {//[i][j]에 저장되는 숫자와 그 전에 저장된 숫자들을 비교하기 위한 반복문
					if(lotto[i][k]==lotto[i][j]) {//[i][j]에 현재 저장되는 숫자와 그 전에 저장된 숫자들을 비교해서 같은값이면
						j--;//열의 길이만큼 반복하는 반복문을 한번 더 실행하여 [i][j]에 새로운 숫자를 대입하고 다시 비교한다. 같은값이 아닐때까지 반복
					}
				}
			}
			

		}


		//정렬
		System.out.println(lotto[0].length);
		for(int i=lotto.length-1;i>=0;i--) {//마지막행부터 출력하고 행을 출력하기 위한 반복문
			for(int k=0;k<lotto[i].length;k++) {//열의 길이만큼 값을 출력을 하기 위한 반복문
				for(int j=0;j<lotto[i].length-1;j++) {//정렬을 위한 크기비교를 열의 길이만큼 반복하기 위한 반복문

					if(lotto[i][j]>lotto[i][j+1]) { //[i][j]의 값과 다음값인 [i][j+1]의 값을 비교하여 [i][j]의 값이 클때
						int temp=lotto[i][j]; //임시변수에 [i][j]값을 저장
						lotto[i][j]=lotto[i][j+1];//[i][j]에 더 작은값인 [i][j+1]의 값을 저장
						lotto[i][j+1]=temp;//[i][j+1]에 임시로 저장했던 [i][j]의 값을 저장
						
						//스와핑을 통해 더 큰값이 뒤의 배열에 위치하도록 저장하고 열의 갯수만큼 반복하여 작은수부터 순서대로 정렬한다.
						}

				}

			}
		}






		//출력
/*
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto[i].length;j++) {
				System.out.print(lotto[i][j]+"/");
			}
			System.out.println();

		}*/

	}

}
