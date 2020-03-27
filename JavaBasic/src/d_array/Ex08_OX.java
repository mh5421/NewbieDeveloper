package d_array;


import java.util.*;
public class Ex08_OX {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("테스트 케이스의 갯수를 입력해주세요:");
		int num = Input.nextInt();
		Input.nextLine();
		
		char cha[][] =new char[num][79]; 
		

		int result[] = new int[num];
		for(int i=0;i<num;i++) {
			int su=0;
			
			char ch[]= Input.nextLine().toCharArray();


			for(int j=0;j<ch.length;j++) {
				
				if(ch[j]=='O') {		
						if((j-1>=0)&&ch[j-1]=='O'){
							su++;
						}
						else
							su++;
				}
				else
					su=0;
				result[i]+=su;
			}
		}
		for(int i=0;i<num;i++)
			System.out.println(result[i]);






	}




}

