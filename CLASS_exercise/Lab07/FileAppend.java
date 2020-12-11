import java.util.*;
import java.io.*;

public class FileAppend {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		File name = new File(scanner.next());
		System.out.print("두번째 파일 이름을 입력하세요>>");
		File name2 = new File(scanner.next());
		System.out.print("합치는 파일 이름을 입력하세요>>");
		File file = new File(scanner.next());
		
		System.out.println("프로젝트 폴더 밑에 "+file+" 파일에 저장하였습니다.");
		
		
		FileReader fr = new FileReader(name);
		FileReader fr2 = new FileReader(name2);
		FileWriter fw=new FileWriter(file);
		
		int c;
		while((c=fr.read()) != -1)
			fw.write((char)c); 
		
		fw.write("\r\n");
		
		while((c=fr2.read()) != -1)
			fw.write((char)c); 
		
		
		
		fr.close(); //필수로 있어야 저장된다.
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
