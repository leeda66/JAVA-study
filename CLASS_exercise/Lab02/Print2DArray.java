
public class Print2DArray {

	public static void main(String[] args) {
		
		int array[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		//2���� �迭array ����ϱ�
		for(int i=0; i<array.length; i++) {
			//i�� �ѹ��� �� ���� ���͸� ģ��
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "	");
			}
			System.out.print("\n");
		}
	}
}
