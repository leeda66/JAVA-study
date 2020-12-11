
public class Person {
	
	private String name;
	private String address;
	private int phone;
	
	public Person(String n, String a, int p) { //생성자
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

//속성 정보: 이름, 주소, 전화번호
//하나 이상의 생성자를 정의
//각 필드에 대하여 접근자와 설정자 메소드를 작성(setter, getter)
