
public class Human {
	
	protected String name;
	protected int age;
	
	public Human(String name, int age){ // 매개 변수의 값으로 필드를 초기화 
		this.name = name;
		this.age = age;
		
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	
	public String getterName(String name) {
		return name;
	}
	
	public void setterAge(int age) {
		this.age = age;
	}
	
	public int getterAge(int age) {
		return age;
	}
	

	public String toString(){ // 객체의 현재 값들을 연결하여 문자열로 반환
		return "이름: " + name + ", 나이: " + age;
	}
	
}
