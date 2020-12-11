import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x1, y1 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("x2, y2 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(y2<100)
			System.out.println("충돌 없음");
		
		else if(x2<100)
			System.out.println("충돌 없음");
		
		else if(x1>200)
			System.out.println("충돌 없음");
		
		else if(y1>200)
			System.out.println("충돌 없음");
			
		else
			System.out.println("충돌 발생");
	


	}

}
