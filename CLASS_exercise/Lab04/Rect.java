
public class Rect implements Shape{

	public int width;
	public int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	public double getArea() {
		return this.width*this.height;
	}

}
