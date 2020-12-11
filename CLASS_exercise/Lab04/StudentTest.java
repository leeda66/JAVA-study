import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Human human_list [] = new Human[3];
		Student student_list [] = new Student[3];
		
		for(int i=1; i<=human_list.length;i++) {
		
			System.out.print("[" + i + "]" + " Human 입력 : ");
	
			String name = scanner.next();
			int age = scanner.nextInt();
			
			Human h = new Human(name, age);
			human_list[i-1] = h;	
		}
		
		for(int i=1; i<=student_list.length;i++) {
			
			System.out.print("[" + i + "]" + " Student 입력 : ");
	
			String name = scanner.next();
			int age = scanner.nextInt();
			String major = scanner.next();
			int sID = scanner.nextInt();
			
			Student s = new Student(name, age, major, sID);
			student_list[i-1] = s;	
		}
		
		
		for(int i=0; i<human_list.length;i++) {
			System.out.println(human_list[i].toString());
		}
		
		for(int i=0; i<student_list.length;i++) {
			System.out.println(student_list[i].toString());
		}
		
	}

}
