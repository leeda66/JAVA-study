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
		System.out.println("�� "+i+"���� ��ȭ��ȣ�� �о����ϴ�.");
		
		
		while(true) {
			System.out.print("�̸�>> ");
			String input = scanner.next();
			if(input.equals("�׸�"))
				break;
			else {
				String num = map.get(input);
				if(num == null) 
					System.out.println("ã�� �̸��� �����ϴ�.");
				else {
					System.out.println(num);	
				}
			}
		}
	}
}
