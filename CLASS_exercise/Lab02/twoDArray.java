
public class twoDArray {

	public static void main(String[] args) {
		
		int array[][] = { {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		
		for(int i = 1; i<=10; i++) {
			int r = (int)(Math.random()*10 + 1); //1~10 범위의 랜덤 정수 r 생성
			
			int a = (int)(Math.random()*3 + 0);
			int b = (int)(Math.random()*3 + 0);
						
			array[a][b] = r;			
		}
		
		for(int j = 0; j <= 3; j++) {
			for(int k = 0; k<=3; k++) {
			System.out.print(array[j][k] +"    ");
			}
		System.out.print("\n");
		}
		
	}
}

//
//		반복문 돌면서 10개만 랜덤한 정수 생성
//		  배열의 행 인덱스 랜덤하게 생성
//		  배열의 열
//
//		  배열 원소가 0이 아니면 이미 값이 저장된 원소이므로 건너뜀
//
//		  그렇지 않다면(해당 원소의 위치가 0이라면) 랜덤 숫자 1-10 저장
//
//		  생성된 숫자 갯수 증가
//
//		2차원 배열 출력

