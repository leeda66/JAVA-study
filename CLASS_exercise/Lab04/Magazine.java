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

//Book 클래스의 하위 클래스로 작성
//추가 속성 정보:  발매일 정보
//한 개 이상의 생성자를 작성 (생성자 내에서 부모 생성자를 호출) : super
//각 필드에 대하여 접근자 메소드와 설정자 메소드를 작성
