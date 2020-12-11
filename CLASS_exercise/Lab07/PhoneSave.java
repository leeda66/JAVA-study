import java.util.Scanner;
import java.io.*;
import java.util.*;

public class PhoneSave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt"); //파일과 연결된 출력 문자 스트림 생성
		
		
		System.out.println("전화번호 입력 프로그램입니다.");
		while(true){
			System.out.print("이름 전화번호 >> ");
			String phone = scanner.nextLine();
			
			if(phone.equals("그만")) //문자열 같은지 비교
				break;
			else {
				fout.write(phone, 0, phone.length());
				fout.write("\r\n", 0, 2);
				
			}
		} fout.close();
	}
			catch(IOException e) {
				System.out.println("입출력 오류");
			}

	}

}
