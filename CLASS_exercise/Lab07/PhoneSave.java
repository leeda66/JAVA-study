import java.util.Scanner;
import java.io.*;
import java.util.*;

public class PhoneSave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:\\temp\\phone.txt"); //���ϰ� ����� ��� ���� ��Ʈ�� ����
		
		
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		while(true){
			System.out.print("�̸� ��ȭ��ȣ >> ");
			String phone = scanner.nextLine();
			
			if(phone.equals("�׸�")) //���ڿ� ������ ��
				break;
			else {
				fout.write(phone, 0, phone.length());
				fout.write("\r\n", 0, 2);
				
			}
		} fout.close();
	}
			catch(IOException e) {
				System.out.println("����� ����");
			}

	}

}
