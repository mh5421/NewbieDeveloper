/*
 * 
 * 자료형 관련 클래스 : Wrapper class
 *  Byte / Short
 *  Character
 *  Integer / Long
 *  Float / Double
 *  
 *  
 *  형변환 관련하여 ...
 *  
 *  
 *   **** String -> int 형
 *   	Integer.parsenInt()
 *   
 *   **** int 형 -> String
 *   	"" + 10 -> "10"
 *   
 *   	String.valueOf(10) -> "10"
 *   
 *   **** 
 */
package c_collection;
import java.util.ArrayList;

class aArrayListEx0
{
	public static void main(String[] args) 
	{
		Object[] ob =dataSet();
		
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		Object[] data = new Object[3];
		
		data[0]=name;
		data[1]=new Integer(age);  //기본형 int 값을 Integer 클래스로 변환
		data[2]=new Double(height);//기본형 double 값을 Double 클래슬 변환

		
		return data;
		
	}
}
