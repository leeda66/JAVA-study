import java.util.Scanner;

public class Grade {
	
	int math; int science; int english; int score;//��� ���� ����

	public Grade(int mth, int sci, int eng) {
		math = mth; science = sci; english = eng;
		
	}//������ �ۼ�(����, ����, ���� ������ ���� �Ű� ���� 3�� �޾Ƽ� ��� ������ ����)

	public int average() {
		score = (math+science+english)/3;
		return score;
	}//�� ������ ����� �����ϴ� average() �޼ҵ� �ۼ�
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+ me.average()); //average()�� ����� ����Ͽ� ����
		
		scanner.close();
		
		
	}

}
