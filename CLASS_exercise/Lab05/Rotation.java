import java.util.Scanner;


public class Rotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String text = scanner.nextLine(); //한줄입력
		
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
