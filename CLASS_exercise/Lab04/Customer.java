
public class Customer extends Person{
	
	private int member;
	private int mileage;

	public Customer(String n, String a, int p, int member, int mile) {
		super(n, a, p); //매개변수가 있으니까, 알아서 처리하지 못하니까 넣어줘야 되는 부분!
	}
	
	public void setterMember(int member) { //setter는 return문이 없으니 int타입으로 할 필요 없음. void로!!
		this.member = member;
	}
	
	public int getterMember(int member) {
		return member;
	}
	
	public void setterMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public int getterMileage(int mileage) {
		return mileage;
	}

}

//Person 클래스의 하위 클래스로 작성
//추가 속성 정보:  고객번호, 마일리지
//한 개 이상의 생성자를 작성
//각 필드에 대하여 접근자 메소드와 설정자 메소드를 작성(setter, getter)
