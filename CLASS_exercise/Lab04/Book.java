
public class Book extends Item {
	
	protected String author;
	
	public Book(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	
	
	public void setterPrice(int price) {
		this.price = price;
	}
	
	public void setterAuthor(String author) {
		this.author = author;
	}
	
	
	public String toString(){ 
		return "[Book]" + name + ", ÀúÀÚ:" + author;
	}


}
