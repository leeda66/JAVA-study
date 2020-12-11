import java.util.*;

public class MovieTest {
	public static void main(String[] args) {
		LinkedHashMap<String, Movie> map = new LinkedHashMap<String, Movie>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 출력");
			System.out.println("3. 영화 정보 검색");
			System.out.println("4. 종료");
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
					System.out.println("[제목:"+key+", 감독:"+ value.author+", 장르:"+value.genre+", 개봉년도:"+value.year+"]");
				}
			}
			
			else if(input==3) {
				
				System.out.print("검색 제목 입력:");
				String inputTitle=scanner.next();
				Movie mv = map.get(inputTitle);
				if(mv==null)
					System.out.println(mv+"는 없는 영화 입니다.");
				else {
					System.out.println("[제목:"+inputTitle+", 감독:"+ mv.author+", 장르:"+mv.genre+", 개봉년도:"+mv.year+"]");
				}
			}
			
			else if(input==4)
				break;
		}
		

	}

}
