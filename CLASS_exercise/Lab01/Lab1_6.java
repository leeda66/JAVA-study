import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int number = scanner.nextInt();

		int A = (int)number/10 ;
		int B = number%10;
		
		System.out.print("박수");
		
		if(A==3 || A==6 || A==9) {
			System.out.print("짝");
				
				if(B==3 || B==6 || B==9)
					System.out.print("짝");
			}
	
		else if(B==3 || B==6 || B==9)
			System.out.print("짝");
		
		else
			System.out.print("없음");

	}

}
