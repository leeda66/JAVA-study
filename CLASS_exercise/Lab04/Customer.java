
public class Customer extends Person{
	
	private int member;
	private int mileage;

	public Customer(String n, String a, int p, int member, int mile) {
		super(n, a, p); //�Ű������� �����ϱ�, �˾Ƽ� ó������ ���ϴϱ� �־���� �Ǵ� �κ�!
	}
	
	public void setterMember(int member) { //setter�� return���� ������ intŸ������ �� �ʿ� ����. void��!!
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

//Person Ŭ������ ���� Ŭ������ �ۼ�
//�߰� �Ӽ� ����:  ����ȣ, ���ϸ���
//�� �� �̻��� �����ڸ� �ۼ�
//�� �ʵ忡 ���Ͽ� ������ �޼ҵ�� ������ �޼ҵ带 �ۼ�(setter, getter)
