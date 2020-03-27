package c_collection;
import java.util.*;


class HashMapTest 
{
	// 전화번호를 저장할 맴변수
	HashMap phoneBook = new HashMap();


	/*
		전화번호 정보를 입력
	*/
	void insertPhoneNo()
	{
		addPhoneNo("가족", "아빠", "010-111-1111");
		addPhoneNo("가족", "엄마", "010-111-1112");
		addPhoneNo("친구", "만득이", "010-333-0303");
		addPhoneNo("업무", "김사장", "010-999-9999");
		addPhoneNo("친구", "천득이", "010-333-3030");
		addPhoneNo("기타", "슈퍼마켓", "032-333-0000");
		addPhoneNo("가족", "동생", "010-111-1113");
		addPhoneNo("기타", "치킨집", "032-777-9292");
		addPhoneNo("친구", "백득이", "010-888-8080");
	}
	
	/*
		전화번호부에 저장
	*/
	void addPhoneNo( String groupName, String name, String tel )
	{
		//--------------------------------------------
		// 1. 전화번호 Map에 해당 그룹이름이 없으면 추가
		// 2. 입력된 그룹이름으로 저장된 HashMap을 얻어옴
		// 3. 그 HashMap에 전화번호와 이름을 저장
		


	}

	/*
		전화번호부 출력	
	*/
	void printPhoneNo()
	{
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while( it.hasNext() )
		{
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ( (HashMap)e.getValue() ).entrySet() ;
			Iterator subIt = subSet.iterator();

			System.out.println(" # " + e.getKey() + " [" + subSet.size() +"]");

			while( subIt.hasNext() )
			{
				Map.Entry  subE = (Map.Entry)subIt.next();
				System.out.println( subE.getValue() + "  " + subE.getKey() );
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		HashMapTest  map = new HashMapTest();
		map.insertPhoneNo();
		map.printPhoneNo();
	}

}
