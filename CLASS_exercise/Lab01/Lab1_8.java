import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x1, y1 �Է�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("x2, y2 �Է�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(y2<100)
			System.out.println("�浹 ����");
		
		else if(x2<100)
			System.out.println("�浹 ����");
		
		else if(x1>200)
			System.out.println("�浹 ����");
		
		else if(y1>200)
			System.out.println("�浹 ����");
			
		else
			System.out.println("�浹 �߻�");
	


	}

}
