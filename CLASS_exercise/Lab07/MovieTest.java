import java.util.*;
import java.io.*;

public class MovieTest {
	public static void main(String[] args) throws Exception{
		HashMap<String, Movie> map = new HashMap<String, Movie>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1.영화 입력/");
			System.out.print("2.영화 출력/");
			System.out.print("3.영화 검색/");
			System.out.print("4.파일 저장/");
			System.out.print("5.파일 열기/");
			System.out.println("6.종료");
			System.out.print("메뉴입력>> ");
			int input =scanner.nextInt();
			scanner.nextLine();
			
			if(input == 1) {
				
				System.out.print("제목:");
				String title = scanner.nextLine();
				System.out.print("감독:");
				String author = scanner.nextLine();			
				System.out.print("장르:");
				String genre = scanner.nextLine();			
				System.out.print("년도:");
				int year = scanner.nextInt();
				

				map.put(title, new Movie(title, author, genre, year));				
			}
			
			else if(input==2) {
				
				for(String key : map.keySet()) {
					Movie value = map.get(key);
					System.out.println("[제목:"+key+", 감독:"+ value.author+", 장르:"+value.genre+", 개봉년도"+value.year+"]");
				}
			}
			
			else if(input==3) {
				
				System.out.print("검색 제목 입력:");
				String inputTitle=scanner.next();
				Movie mv = map.get(inputTitle);
				if(mv==null)
					System.out.println(mv+"는 없는 영화 입니다.");
				else {
					System.out.println("[제목:"+inputTitle+", 감독:"+ mv.author+", 장르:"+mv.genre+", 개봉년도"+mv.year+"]");
				}
			}
			
			
			else if(input==4) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
				oos.writeObject(map);
				oos.close();
				System.out.println("movie.dat에 저장되었습니다.");
			}
			
			
			else if(input==5) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie.dat"));
			map = (HashMap<String, Movie>)ois.readObject();
			ois.close();
			System.out.println("movie.dat로 부터 불러왔습니다.");
		}
		
			else if(input==6)
			break;
	}

		scanner.close();
	
}
}

