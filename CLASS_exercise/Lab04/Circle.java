
public class Circle implements Shape{
	public int rad;
	public Circle(int rad) {
		this.rad = rad;
	}
	public void draw() {
		System.out.println("�������� "+rad+"�� ���Դϴ�.");
	}
	public double getArea() {
		return this.PI*this.rad*this.rad;
	}

}
