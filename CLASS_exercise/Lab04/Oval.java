
public class Oval implements Shape{

	public int longer;
	public int shorter;
	public Oval(int longer, int shorter) {
		this.longer = longer;
		this.shorter = shorter;
	}
	public void draw() {
		System.out.println(longer+"x"+shorter+"에 내접하는 타원입니다.");
	}
	public double getArea() {
		return this.PI*this.longer*this.shorter;
	}

}
