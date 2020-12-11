import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
		int [] count = {0, 0, 0, 0, 0, 0, 0, 0}; //돈의 종류별 필요한 개수
		
		System.out.print("금액을 입력하시오>> ");
		int money = scanner.nextInt();
		
		for(int i=0; i<=7; i++) {
			
			int num = (int)(money / unit[i]);
			count[i] = num;
			money = money - (num * (unit[i]));
			
			if(num != 0) {
			System.out.println(unit[i]+"원 짜리 : "+ count[i]+ "개");
			}
		}
	}
}
