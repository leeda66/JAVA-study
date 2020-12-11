import java.util.Scanner;

public class Lab1_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심 x1, y1, 반지름 radius1 >>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int radius1 = scanner.nextInt();

		System.out.print("원의 중심 x2, y2, 반지름 radius2 >>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		

		double distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		int redius = (radius1 + radius2);

		
		if(redius == distance)
			System.out.println("두 원은 서로 겹친다.");
		
		else if(redius > distance)
			System.out.println("두 원은 서로 겹친다.");
		
		else if(redius < distance)
			System.out.println("두 원은 서로 겹치지 않는다.");
			}

}
