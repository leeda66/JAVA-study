
public class Human {
	
	protected String name;
	protected int age;
	
	public Human(String name, int age){ // �Ű� ������ ������ �ʵ带 �ʱ�ȭ 
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
	

	public String toString(){ // ��ü�� ���� ������ �����Ͽ� ���ڿ��� ��ȯ
		return "�̸�: " + name + ", ����: " + age;
	}
	
}
