package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	ArrayList<Student> studata = method();
	//여기서 출력
	for(Student data:studata ) {
		System.out.println(data);
	}
	
	for(int i=0;i<studata.size();i++) {
		Student data = (Student)studata.get(i);
		System.out.println(data);
	}
	
	}
	static ArrayList<Student> method() {
		//세명의 학생 정보를 저장 : ArrayList
		Student a = new Student("유태완",31);
		Student b = new Student("정아인",28);
		Student c = new Student("정준",29);
		
		ArrayList<Student> studata = new ArrayList<Student>();

		studata.add(a);
		studata.add(b);
		studata.add(c);
		
		
		return studata;
		
		
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
