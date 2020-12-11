import java.io.*;

public class PhoneOpen {

	public static void main(String[] args) {
		FileReader fin =null;
		try {
			fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			System.out.println("c:\\temp\\phone.txt를 출력합니다.");
			while((c=fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		
		
		
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
