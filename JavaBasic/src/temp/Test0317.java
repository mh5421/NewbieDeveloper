package temp;

public class Test0317 {
	public static void main(String args[]) {
		int i =2, j=0;
		switch ( i ) {
		
		case 2 : j += 6; break;//j=j+6;
		case 4 : j += 1; break;//j=j+1;
		default : j += 2;//j=j+2;
		case 0 : j += 4; break;//j=j+4;
		}
		System.out.println( j ); //13

	}
}