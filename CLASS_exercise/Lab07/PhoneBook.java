import java.util.*;
import java.io.*;
public class PhoneBook {

	public static void main(String[] args) throws Exception {
		HashMap<String, String> map =  new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		FileReader fr = new FileReader("c:/temp/phone.txt");
		Scanner fscan=new Scanner(fr);
		
		int i=0;
		while(fscan.hasNext()) {
			map.put(fscan.next(), fscan.next());
			i++;
		}
		System.out.println("총 "+i+"개의 전화번호를 읽었습니다.");
		
		
		while(true) {
			System.out.print("이름>> ");
			String input = scanner.next();
			if(input.equals("그만"))
				break;
			else {
				String num = map.get(input);
				if(num == null) 
					System.out.println("찾는 이름이 없습니다.");
				else {
					System.out.println(num);	
				}
			}
		}
	}
}
