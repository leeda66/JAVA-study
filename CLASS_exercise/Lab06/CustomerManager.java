import java.util.*;

public class CustomerManager {
	
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public CustomerManager() { }
	
	public void code() {
		System.out.println("** 포인트 관리 프로그램입니다 **");

		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int point = scanner.nextInt();
			
			Integer n = map.get(name);
			if(n != null) { 
				point += n; 
			}
			
			map.put(name, point); 
			print();
		}
	}
	
	
	void print() {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int point = map.get(name);
			System.out.print("("+name+","+point+")");			
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager();
		customer.code();
	}
}
