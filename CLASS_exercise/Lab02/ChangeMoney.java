import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ����
		int [] count = {0, 0, 0, 0, 0, 0, 0, 0}; //���� ������ �ʿ��� ����
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money = scanner.nextInt();
		
		for(int i=0; i<=7; i++) {
			
			int num = (int)(money / unit[i]);
			count[i] = num;
			money = money - (num * (unit[i]));
			
			if(num != 0) {
			System.out.println(unit[i]+"�� ¥�� : "+ count[i]+ "��");
			}
		}
	}
}
