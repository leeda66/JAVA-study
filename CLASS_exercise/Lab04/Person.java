
public class Person {
	
	private String name;
	private String address;
	private int phone;
	
	public Person(String n, String a, int p) { //������
		name = n;
		address = a;
		phone = p;
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	
	public String getterName(String name) {
		return name;
	}
	
	public void setterAddress(String address) {
		this.address = address;
	}
	
	public String getterAddress(String address) {
		return address;
	}
	public void setterPhone(int phone) {
		this.phone = phone;
	}
	
	public int getterPhone(int phone) {
		return phone;
	}
	

}

//�Ӽ� ����: �̸�, �ּ�, ��ȭ��ȣ
//�ϳ� �̻��� �����ڸ� ����
//�� �ʵ忡 ���Ͽ� �����ڿ� ������ �޼ҵ带 �ۼ�(setter, getter)
