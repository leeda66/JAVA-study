
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
		return "�̸�: " + name + ", ����: " + age + ", ����: " + major + ", �й�: "+ sID;	
	}
	
//Object Ŭ������ toString() �޼ҵ� ������
//�θ��� toString()��ȣ���Ͽ� �޾ƿ� ���ڿ� ���� �߰��� ���� �� �����Ͽ� ���ڿ� ��ȯ
}
