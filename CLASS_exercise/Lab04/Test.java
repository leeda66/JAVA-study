
public class Test {

	public static void main(String[] args) {
		Buyer m = new Buyer(40000);
		m.buy((new Food("�����", 5000)), 3);
		m.buy((new Food("���", 3000)), 2);
		m.buy((new Book("Java Programming", 7000, "�ڹ�")), 1);
		m.buy((new Movie("�λ���", 8000, "����ȣ")), 1);
		m.buy((new Food("���", 2000)), 3);
	
	}
}
