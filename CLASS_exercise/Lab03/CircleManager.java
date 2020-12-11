import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double getArea() {
		return Math.PI * radius *radius;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);//Circle ��ü ����
		}
		for(int i=0; i<c.length;i++)
			c[i].show();//��� Circle ��ü ���(�ش� �޼ҵ� ���)
		int biggestIndex=0;
		for(int i=1; i<c.length; i++) {
			if(c[i].getArea()>=c[biggestIndex].getArea()) //���� �Լ��� ���� ��
				biggestIndex = i;//���� ū ������ ���� index�� ����
		}
		System.out.print("���� ������ ū ���� ");
		c[biggestIndex].show();
		scanner.close();
	}

}
