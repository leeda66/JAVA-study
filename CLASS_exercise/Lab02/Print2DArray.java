
public class Print2DArray {

	public static void main(String[] args) {
		
		int array[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		//2차원 배열array 출력하기
		for(int i=0; i<array.length; i++) {
			//i가 한번을 다 돌면 엔터를 친다
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
}
