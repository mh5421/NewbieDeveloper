package i_abstract;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 화면가정 - 여기서 그림을 그린다 가정
		Sharp s = method();
		s.draw();

	}

	static Sharp method(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("님이 원하는 도형은? 1.사각 2.삼각 3.원");
		int sel = in.nextInt();
		
		Sharp s = null;
		switch(sel){
		case 1 : s = new Rect();
			break;
		case 2 : s = new Tri(); 
			break;
		case 3 : s = new Circle();
			break;
		}


		return s;
	}
	//		[ 추가 ] 밑변이나 높이 등의 값을 각각 입력 받아 넓이 구하기
}

abstract class Sharp{
	Scanner in = new Scanner(System.in);
	int height = 0;
	int width = 0;
	int r= 0;
	public abstract void draw();

}
class Rect extends Sharp{
	public void draw(){
		System.out.print("사각형의 높이와 길이를 입력하세요->");
		height= in.nextInt();
		width = in.nextInt();
		System.out.println("사각형의 넓이는 "+height * width+"입니다.");
	}

	public void rectangel(){
		System.out.println("사각형은 점 4개의 도형입니다.");
	}
}
class Circle  extends Sharp{
	public void draw(){
		System.out.print("원의 반지름을 입력하세요->");
		r = in.nextInt();
		System.out.println("원의 넓이는 "+r*r*Math.PI+"입니다.");
	}


}
class Tri  extends Sharp{
	public void draw(){
		System.out.print("삼각형의 높이와 밑변을 입력하세요->");
		height = in.nextInt();
		width = in.nextInt();
		System.out.println("삼각형의 넓이는 "+(double)height*width/2+"입니다.");
	}

} 
