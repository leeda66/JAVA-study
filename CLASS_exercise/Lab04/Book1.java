
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

//속성 정보: 제목, 페이지수, 저자, 책의 개수(count-클래스 변수로 정의) : static int count
//하나 이상의 생성자를 정의
//책이 생성될 때마다 책의 수(count)를 증가
//각 필드에 대하여 접근자와 설정자 메소드를 작성
//책의 개수에 대해서는 접근자 메소드만 클래스 메소드로 작성