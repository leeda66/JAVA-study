import java.awt.print.Book;

public class Magazine extends Book {
	
	private int date;

	public Magazine() {
		super();
	}
	
	public void setterDate(int date) {
		this.date = date;
	}
	
	public int getterDate(int date) {
		return date;
	}
	

}

//Book Ŭ������ ���� Ŭ������ �ۼ�
//�߰� �Ӽ� ����:  �߸��� ����
//�� �� �̻��� �����ڸ� �ۼ� (������ ������ �θ� �����ڸ� ȣ��) : super
//�� �ʵ忡 ���Ͽ� ������ �޼ҵ�� ������ �޼ҵ带 �ۼ�
