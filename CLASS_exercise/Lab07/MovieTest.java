import java.util.*;
import java.io.*;

public class MovieTest {
	public static void main(String[] args) throws Exception{
		HashMap<String, Movie> map = new HashMap<String, Movie>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1.��ȭ �Է�/");
			System.out.print("2.��ȭ ���/");
			System.out.print("3.��ȭ �˻�/");
			System.out.print("4.���� ����/");
			System.out.print("5.���� ����/");
			System.out.println("6.����");
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
					System.out.println("[����:"+key+", ����:"+ value.author+", �帣:"+value.genre+", �����⵵"+value.year+"]");
				}
			}
			
			else if(input==3) {
				
				System.out.print("�˻� ���� �Է�:");
				String inputTitle=scanner.next();
				Movie mv = map.get(inputTitle);
				if(mv==null)
					System.out.println(mv+"�� ���� ��ȭ �Դϴ�.");
				else {
					System.out.println("[����:"+inputTitle+", ����:"+ mv.author+", �帣:"+mv.genre+", �����⵵"+mv.year+"]");
				}
			}
			
			
			else if(input==4) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
				oos.writeObject(map);
				oos.close();
				System.out.println("movie.dat�� ����Ǿ����ϴ�.");
			}
			
			
			else if(input==5) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie.dat"));
			map = (HashMap<String, Movie>)ois.readObject();
			ois.close();
			System.out.println("movie.dat�� ���� �ҷ��Խ��ϴ�.");
		}
		
			else if(input==6)
			break;
	}

		scanner.close();
	
}
}

