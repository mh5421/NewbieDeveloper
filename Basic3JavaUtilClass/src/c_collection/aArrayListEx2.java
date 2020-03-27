package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		for(String data:list) {
			System.out.println(data);
		}
		
		
		for(int i=0;i<list.size();i++) {
			String data = (String)list.get(i);
			System.out.println(data);
		}
	}
}
