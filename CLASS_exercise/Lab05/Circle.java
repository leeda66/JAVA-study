
public class Circle {
	
	int x; int y; int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;	
	}
	
	//Object 클래스의 toString(), equals() 메소드 재정의
	public String toString() {
			return "Circle("+x+","+y+")반지름"+radius;
		}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(x==c.x && y==c.y) return true;
		else return false;
		
	}
	
}