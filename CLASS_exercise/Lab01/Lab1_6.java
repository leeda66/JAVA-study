import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int number = scanner.nextInt();

		int A = (int)number/10 ;
		int B = number%10;
		
		System.out.print("�ڼ�");
		
		if(A==3 || A==6 || A==9) {
			System.out.print("¦");
				
				if(B==3 || B==6 || B==9)
					System.out.print("¦");
			}
	
		else if(B==3 || B==6 || B==9)
			System.out.print("¦");
		
		else
			System.out.print("����");

	}

}
