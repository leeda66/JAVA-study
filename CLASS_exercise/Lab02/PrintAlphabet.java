import java.util.Scanner;

public class PrintAlphabet {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
			System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
			
			String s = scanner.next(); // ���ڿ� �б�
			char c = s.charAt(0); //���ڿ��� ù ��° ����
			
			if('a'<= c && c <= 'z') {
				
				for(char i = c; 'a'<=i; i--) {
					
					for(char j = 'a'; j<=i; j++) {
						System.out.print(j);
					}
					
					System.out.print("\n");
				}
			}
					
//			char uni = (char) c; //�����ڵ尪 uni
//			int num = (int) (uni - 'a'); //���ڿ��迭�� ���� ��
//			
//				for(int i = (num+1); i >= 1; i--) {
//					//���ǹ�if �� �ƴ϶� �ݺ��� for �̿�
//					for(char j = 'a'; uni >= j; j++) {
//						System.out.print(j);
//					}	
//				System.out.print("\n");
//				}
	   	}
}