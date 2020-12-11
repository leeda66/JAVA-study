import java.util.*;

public class MovieTest {
	public static void main(String[] args) {
		LinkedHashMap<String, Movie> map = new LinkedHashMap<String, Movie>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. ��ȭ ���� �Է�");
			System.out.println("2. ��ȭ ���� ���");
			System.out.println("3. ��ȭ ���� �˻�");
			System.out.println("4. ����");
			System.out.print("�޴��Է�>> ");
			int input =scanner.nextInt();
			scanner.nextLine();
			if(input == 1) {
				
				System.out.print("����:");
				String title = scanner.nextLine();
				System.out.print("����:");
				String author = scanner.nextLine();			
				System.out.print("�帣:");
				String genre = scanner.nextLine();			
				System.out.print("�⵵:");
				int year = scanner.nextInt();
				
				map.put(title, new Movie(title, author, genre, year));				
			}
			
			else if(input==2) {
				
				for(String key : map.keySet()) {
					Movie value = map.get(key);
					System.out.println("[����:"+key+", ����:"+ value.author+", �帣:"+value.genre+", �����⵵:"+value.year+"]");
				}
			}
			
			else if(input==3) {
				
				System.out.print("�˻� ���� �Է�:");
				String inputTitle=scanner.next();
				Movie mv = map.get(inputTitle);
				if(mv==null)
					System.out.println(mv+"�� ���� ��ȭ �Դϴ�.");
				else {
					System.out.println("[����:"+inputTitle+", ����:"+ mv.author+", �帣:"+mv.genre+", �����⵵:"+mv.year+"]");
				}
			}
			
			else if(input==4)
				break;
		}
		

	}

}
