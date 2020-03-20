package d_array;

public class Ex04_정렬 {
	
	public static void main(String[] args) {
		
		int score[] = new int[] {88,99 ,22,13,77};
		//버블 정렬
		
		for(int i= score.length-1; i>0;i--) {
			for(int j=0;j<i;j++) {
				if(score[j]>score[j+1]) {
					int temp = 0;
					temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
					
				}
			}
			
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+ " ");
		}
		
		//선택정렬
		
	}

}
