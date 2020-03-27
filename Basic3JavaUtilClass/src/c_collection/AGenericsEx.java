package c_collection;
import java.util.ArrayList;

class MyType <K, V>
{
	 K name;
	 V value;
	 
	 MyType( K  name, V value)
	 {
		 this.name = name;
		 this.value = value;
	 }
	 
	 K getName()
	 {
		 return name;
	 }
	 
	 V getValue()
	 {
		 return value;
	 }	 
}

public class AGenericsEx
{
	public static void main(String[] args)
	{

		MyType <String, String> name = new MyType("이름", "김자바");
		MyType <String, Integer> age = new MyType("나이", new Integer( 44));
		MyType <String, Double> height = new MyType("키", new Double(180.3));
		
		ArrayList <MyType> list = new ArrayList  <MyType>();
		list.add( name );
		list.add( age );
		list.add( height );
		
		//for( int i=0; i < list.size(); i++)
		for( MyType type : list )
		{
			//MyType  type = list.get(i);
			System.out.print( type.getName() + " > ");
			System.out.println( type.getValue());
		}

	}
}