
public class Student extends Human {
	
	private String major;
	private int sID;
	

	public Student(String name, int age, String major, int sID) {
		super(name, age);
		this.major = major;
		this.sID = sID;
	}
	
	public void setterMajor(String major) {
		this.major = major;
	}
	
	public String getterMajor(String major) {
		return major;
	}
	
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 전공: " + major + ", 학번: "+ sID;	
	}
	
//Object 클래스의 toString() 메소드 재정의
//부모의 toString()을호출하여 받아온 문자열 값에 추가로 전공 값 연결하여 문자열 반환
}
