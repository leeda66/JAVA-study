import java.util.Scanner;

public class PrintAlphabet {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
			System.out.print("소문자 알파벳 하나를 입력하시오>> ");
			
			String s = scanner.next(); // 문자열 읽기
			char c = s.charAt(0); //문자열의 첫 번째 문자
			
			if('a'<= c && c <= 'z') {
				
				for(char i = c; 'a'<=i; i--) {
					
					for(char j = 'a'; j<=i; j++) {
						System.out.print(j);
					}
					
					System.out.print("\n");
				}
			}
					
//			char uni = (char) c; //유니코드값 uni
//			int num = (int) (uni - 'a'); //문자열배열의 글자 수
//			
//				for(int i = (num+1); i >= 1; i--) {
//					//조건문if 이 아니라 반복문 for 이용
//					for(char j = 'a'; uni >= j; j++) {
//						System.out.print(j);
//					}	
//				System.out.print("\n");
//				}
	   	}
}