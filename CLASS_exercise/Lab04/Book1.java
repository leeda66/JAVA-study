
public class Book1 {
	
	private String name;
	private int page;
	private String auther;
	static int count =0;

	public Book1(){
		count += 1;
	}
	
	
	public void setterName(String name) {
		this.name = name;
	}
	
	public String getterName(String name) {
		return name;
	}
	
	public void setterPage(int page) {
		this.page = page;
	}
	
	public int getterPage(int page) {
		return page;
	}
	
	public void setterAuther(String auther) {
		this.auther = auther;
	}
	
	public String getterAuther(String auther) {
		return auther;
	}
	
	public int getterCount(int count) {
		return count;
	}
	
}

//�Ӽ� ����: ����, ��������, ����, å�� ����(count-Ŭ���� ������ ����) : static int count
//�ϳ� �̻��� �����ڸ� ����
//å�� ������ ������ å�� ��(count)�� ����
//�� �ʵ忡 ���Ͽ� �����ڿ� ������ �޼ҵ带 �ۼ�
//å�� ������ ���ؼ��� ������ �޼ҵ常 Ŭ���� �޼ҵ�� �ۼ�