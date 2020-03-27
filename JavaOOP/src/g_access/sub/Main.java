package g_access.sub;

// 1. 동일한 패키지에서 확인
class Main 
{
	public static void main(String[] args) 
	{
		Access me = new Access();
		// 에러나는 부분을 주석으로 처리
		//me.a = "프라이빗 변경";
		me.b = "퍼블릭 변경";
		me.c = "프로텍티드 변경";
		me.d = "디폴트 변경";
		
		
		me.output();
	}
}
