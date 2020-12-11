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
	
	public void waitEnterKey() { //enterŰ ��ٸ�
		scanner.nextLine(); 
	} 
	
	public boolean turn() {
		System.out.print("[" + name + "]:<Enter>");			
		waitEnterKey(); 
		
		int num[] = new int [3]; // 3���� ������ �����ϱ� ���� �迭
		
		 // 3���� ���� ���� 
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3 + 1); // 1~3������ ������ �� �߻�
		}
		
		 // 3���� ���� ���
		System.out.print("        ");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"    ");
		}
	
		 // 3���� ������ ������ ��
		boolean result = true;
		for (int i=0; i<num.length; i++) {
			if (num[i] != num[0]) { // �ϳ��� �ٸ��� false
				result = false; // ���� ����
				break;
			}
		}
		
		return result; // result�� true �̸� �¸�
	}

}
