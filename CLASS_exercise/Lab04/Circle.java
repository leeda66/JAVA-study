
public class Circle implements Shape{
	public int rad;
	public Circle(int rad) {
		this.rad = rad;
	}
	public void draw() {
		System.out.println("반지름이 "+rad+"인 원입니다.");
	}
	public double getArea() {
		return this.PI*this.rad*this.rad;
	}

}
