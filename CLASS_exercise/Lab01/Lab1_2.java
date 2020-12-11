import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("2자리수 정수 입력(10~99)>>");
		int number = scanner.nextInt();

		int A = (int)number/10 ;
		int B = number%10;
		
		if(A == B)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
			

	}

}
