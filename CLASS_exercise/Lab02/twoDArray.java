
public class twoDArray {

	public static void main(String[] args) {
		
		int array[][] = { {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		
		for(int i = 1; i<=10; i++) {
			int r = (int)(Math.random()*10 + 1); //1~10 ������ ���� ���� r ����
			
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
//		�ݺ��� ���鼭 10���� ������ ���� ����
//		  �迭�� �� �ε��� �����ϰ� ����
//		  �迭�� ��
//
//		  �迭 ���Ұ� 0�� �ƴϸ� �̹� ���� ����� �����̹Ƿ� �ǳʶ�
//
//		  �׷��� �ʴٸ�(�ش� ������ ��ġ�� 0�̶��) ���� ���� 1-10 ����
//
//		  ������ ���� ���� ����
//
//		2���� �迭 ���

