import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int number = scanner.nextInt();

		int A = (int)number/10 ;
		int B = number%10;
		
		if(A == B)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�");
		
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�");
			

	}

}
