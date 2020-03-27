package c_control;


import java.util.*;
public class Ex04_for중첩 {
	public static void main(String[] args) {

		//*
		
		System.out.println("*");

		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//-------------------------------------------
		/*
		//A~Z 한줄에 출력
		for(int i=0;i<26;i++) {
		for(char ch='A';ch<='A'+i;ch++) {
			
			
			System.out.print(ch);
			}
			System.out.println();
		}*/
		
		//for중첩
		
		//(1)
		//A~Z 한줄에 출력
		/*
				for(int i=0;i<26;i++) {
				for(char ch='A';ch<='A'+i;ch++) {
					
					
					System.out.print(ch);
					}
					System.out.println();
				}
				*/
		//(2)
		/*
		for(int i=0;i<26;i++) {
			for(char ch='A';ch<='Z'-i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
			
		}
		*/
		
		//(3)
		/*
		for(int i=0;i<26;i++) {
			for(char ch=(char)('A'+i);ch<='Z';ch++) {
				System.out.print(ch);
				
			}
			System.out.println();
		}
		*/
		//(4)
		/*
		for(int i=0;i<26;i++) {
			for(char ch='Z';ch>='Z'-i;ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		//(5)
		/*
		 * 		for(int i=0;i<26;i++) {
		 
			for(int k=0; k<i;k++) {
				System.out.print(" ");
			}
			
			for(char ch=(char)('A'+i);ch<='Z';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
	
	}

}
