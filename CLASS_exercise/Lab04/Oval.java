
public class Oval implements Shape{

	public int longer;
	public int shorter;
	public Oval(int longer, int shorter) {
		this.longer = longer;
		this.shorter = shorter;
	}
	public void draw() {
		System.out.println(longer+"x"+shorter+"�� �����ϴ� Ÿ���Դϴ�.");
	}
	public double getArea() {
		return this.PI*this.longer*this.shorter;
	}

}
