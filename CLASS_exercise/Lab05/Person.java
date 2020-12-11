import java.util.Scanner;

public class Person {
	Scanner scanner = new Scanner(System.in);
	
	protected String name;
	public Person(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void waitEnterKey() { //enter키 기다림
		scanner.nextLine(); 
	} 
	
	public boolean turn() {
		System.out.print("[" + name + "]:<Enter>");			
		waitEnterKey(); 
		
		int num[] = new int [3]; // 3개의 난수를 저장하기 위한 배열
		
		 // 3개의 난수 생성 
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3 + 1); // 1~3까지의 임의의 수 발생
		}
		
		 // 3개의 난수 출력
		System.out.print("        ");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"    ");
		}
	
		 // 3개의 난수가 같은지 비교
		boolean result = true;
		for (int i=0; i<num.length; i++) {
			if (num[i] != num[0]) { // 하나라도 다르면 false
				result = false; // 같지 않음
				break;
			}
		}
		
		return result; // result가 true 이면 승리
	}

}
