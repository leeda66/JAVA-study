
public class Circle {
	
	int x; int y; int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;	
	}
	
	//Object Ŭ������ toString(), equals() �޼ҵ� ������
	public String toString() {
			return "Circle("+x+","+y+")������"+radius;
		}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(x==c.x && y==c.y) return true;
		else return false;
		
	}
	
}