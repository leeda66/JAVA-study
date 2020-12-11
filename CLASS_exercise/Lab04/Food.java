
public class Food extends Item {
	
		
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setterPrice(int price) {
		this.price = price;
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	
	public String toString(){ 
		return "[Food]" + name;
	}


}
