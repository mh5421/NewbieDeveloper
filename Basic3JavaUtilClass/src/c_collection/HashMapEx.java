package c_collection;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapEx 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in);
		
		HashMap  map = new HashMap();
		map.put("javassem", "1111");
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림?
		map.put("kimssem", "1234"); 
		map.put("kimjava", "9999");
		map.put("kimbabo", "1234");
		
		boolean stop = false;
		while( !stop )
		{
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("패스워드 -> ");
			String pass = input.nextLine();			
			
			// 1-1. 입력받은 id가 map에서 key 부분에 해당되는 것이 있다면
			if(map.containsKey(id)) {//map의 key 부분이 인자값과 같다면
	
				// 2-1. 그 아이디와 같은 key의 value값과 입력받은 패스워드가 같다면 로그인 성공
				if(map.get(id).equals(pass)) {//입력받은 패스워드랑 비교하여
					System.out.println("로그인 성공!");
					stop=true;
				}else {
			    // 2-2. 패스워드가 다르다면 출력
					System.out.println("패스워드 다릅니다. 다시입력해");
					continue;
				}
		   // 1-2. 없다면 해당하는 아이디 없다고 출력
			}else {
				System.out.println("존재하지 않는 아이디입니다. 다시입력해");
				continue;
			}
			
		}
	}
}
