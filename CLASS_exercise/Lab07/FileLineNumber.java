import java.io.*;
import java.util.Scanner;

public class FileLineNumber {

	public static void main(String[] args) {
		
		FileReader fin =null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int k=1;
			Scanner scanner = new Scanner(fin); //fin�� �Է¹���
			System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
			while(scanner.hasNextLine()) {
				System.out.printf("%4d: ",k); //�ٹ�ȣ ���
				System.out.print(scanner.nextLine());
				System.out.println("");
				k++;
			}
			
			fin.close();
		}
		
		
		
		catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
