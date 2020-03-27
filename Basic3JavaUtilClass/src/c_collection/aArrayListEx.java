
//동적인 배열 : ArrayList

package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList data = dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
		
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		ArrayList data = new ArrayList(2);
		data.add(name);
		data.add(age);
		data.add(height);

		return data;

	}
}
