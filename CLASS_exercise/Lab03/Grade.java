import java.util.Scanner;

public class Grade {
	
	int math; int science; int english; int score;//멤버 변수 선언

	public Grade(int mth, int sci, int eng) {
		math = mth; science = sci; english = eng;
		
	}//생성자 작성(수학, 과학, 영어 점수를 위한 매개 변수 3개 받아서 멤버 변수에 저장)

	public int average() {
		score = (math+science+english)/3;
		return score;
	}//세 과목의 평균을 리턴하는 average() 메소드 작성
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+ me.average()); //average()는 평균을 계산하여 리턴
		
		scanner.close();
		
		
	}

}
