import java.util.Scanner;


public class Rotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String text = scanner.nextLine(); //�����Է�
		
		int num = text.length();
		for(int i=1; i<=num; i++) {
			String head = text.substring(i);
			//String printText = text.substring(i, num-i);
			//System.out.println(head);
			//System.out.println(printText);
			
			String tail = text.substring(0, i);
			String last = head + tail;
			
			System.out.println(last);
			
		}
		
		

	}

}
