import java.util.*;
import java.io.*;

public class FileAppend {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		File name = new File(scanner.next());
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		File name2 = new File(scanner.next());
		System.out.print("��ġ�� ���� �̸��� �Է��ϼ���>>");
		File file = new File(scanner.next());
		
		System.out.println("������Ʈ ���� �ؿ� "+file+" ���Ͽ� �����Ͽ����ϴ�.");
		
		
		FileReader fr = new FileReader(name);
		FileReader fr2 = new FileReader(name2);
		FileWriter fw=new FileWriter(file);
		
		int c;
		while((c=fr.read()) != -1)
			fw.write((char)c); 
		
		fw.write("\r\n");
		
		while((c=fr2.read()) != -1)
			fw.write((char)c); 
		
		
		
		fr.close(); //�ʼ��� �־�� ����ȴ�.
		fr2.close();
		fw.close();
		
	}

}

		
		/**
		Scanner scanner1 = new Scanner(fr);
		Scanner scanner2 = new Scanner(fr2);
		
		while(scanner1.hasNextLine()) {
			String c = scanner1.nextLine();
			fw.write(c,0,c.length()); fw.write("\r\n",0,2);
		}
		
		while(scanner2.hasNextLine()) {
			String k = scanner2.nextLine();
			fw.write(k,0,k.length()); fw.write("\r\n",0,2);
		}
		


		
	}
}
**/
