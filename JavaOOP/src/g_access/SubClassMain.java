package g_access;

import g_access.sub.Access;


//3. 다른 패키지이지만 상속 관계라면
public class SubClassMain  extends Access
{
	public static void main(String[] args) 
	{
		// 자식 클래스로 객체를 생성해야 한다.
		SubClassMain me = new SubClassMain();
		
		//me.a = "프라이빗 변경";
		me.b = "퍼블릭 변경";
		me.c = "프로텍티드 변경";
		//me.d = "디폴트 변경";
		
		
	
		me.output();
	}
}
