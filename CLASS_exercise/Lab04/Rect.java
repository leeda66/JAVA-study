
public class Rect implements Shape{

	public int width;
	public int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println(width+"x"+height+"ũ���� �簢�� �Դϴ�.");
	}
	public double getArea() {
		return this.width*this.height;
	}

}
