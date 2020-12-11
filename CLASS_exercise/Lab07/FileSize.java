import java.io.*;
import java.util.*;

public class FileSize {

	public static void main(String[] args) {
		File f = new File("c:\\");
		File[] subfile = f.listFiles();

		long max=0;
		String path=null;
		
		for(int i=0;i<subfile.length;i++) {
			File file = subfile[i];
			if(max<=file.length()) {
				max = file.length();
				path = file.getPath();
			}
		}
		System.out.println("가장 큰 파일은 "+path+" "+max+"바이트");
	}

}