package jdbc.gui;

public class InfoVO {
	String name;
	String jumin;
	String tel;
	int age;
	String gender;
	String home;
	
	InfoVO(){
			
	}
	
	public InfoVO(String name, String jumin, String tel, String gender, int age, String home) {
		this.name = name;
		this.jumin = jumin;
		this.tel = tel;
		this.age = age;
		this.gender =gender;
		this.home = home;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
		
	}
	public String toString() {
		return name + "\t"+jumin + "\t" + tel+ "\t"+gender +"\t"+ age + "\t"+home+"\n";
	}
}
