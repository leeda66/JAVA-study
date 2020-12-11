
public class Movie extends Item {
	
	protected String supervisor;

	public Movie (String name, int price, String supervisor) {
		this.name = name;
		this.price = price;
		this.supervisor = supervisor;
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	
	public void setterPrice(int price) {
		this.price = price;
	}
	
	public void setterSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	public String toString(){ 
		return "[Movie]" + name + ", °¨µ¶:" + supervisor;
	}


}
