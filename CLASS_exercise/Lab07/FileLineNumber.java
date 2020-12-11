import java.io.*;
import java.util.Scanner;

public class FileLineNumber {

	public static void main(String[] args) {
		
		FileReader fin =null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int k=1;
			Scanner scanner = new Scanner(fin); //fin을 입력받음
			System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
			while(scanner.hasNextLine()) {
				System.out.printf("%4d: ",k); //줄번호 출력
				System.out.print(scanner.nextLine());
				System.out.println("");
				k++;
			}
			
			fin.close();
		}
		
		
		
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
