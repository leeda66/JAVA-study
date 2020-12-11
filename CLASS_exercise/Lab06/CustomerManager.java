import java.util.*;

public class CustomerManager {
	
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public CustomerManager() { }
	
	public void code() {
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
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
