import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		while(true) {
			
			System.out.print("���� �̸�>> ");
			String name = scanner.next(); // ���ڿ� �б�
			
				if("�׸�".equals(name)) 
					break;
				
				else {
					
					int tmp = 0;
					for(int i = 0; i<5; i++) {
						
						if(course[i].equals(name)){
							System.out.println(course[i]+"�� ������ "+score[i]);
							tmp = tmp+1;
							
						}
					}
					
					if(tmp == 0)
						System.out.println("���� �����Դϴ�.");
					
							
					}
				}
	}

}
