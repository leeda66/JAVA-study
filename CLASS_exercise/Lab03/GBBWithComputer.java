import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"}; //���ڿ� �迭
		String result;
		
		while(true) {
			
		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n" + "���� ���� ��!>> ");
		String player = scanner.next(); // ���ڿ� �б�
		
		if("�׸�".equals(player)) 
			break;
		
		else {
				
			int n = (int)(Math.random()*3); // 0, 1, 2 �߿��� �����ϰ� ���� 
			String computer = str[n];
			
			{
				
				result = "";
			
				if("����".equals(player)) {
					
					if("����".equals(computer))
						result = "�����ϴ�.";
					
					else if("����".equals(computer))
						result = "��ǻ�Ͱ� �̰���ϴ�.";
					
					else if("��".equals(computer))
						result = "����ڰ� �̰���ϴ�.";
					
				}
				
				else if("����".equals(player)) {
					
					if("����".equals(computer))
						result = "�����ϴ�.";
					
					else if("��".equals(computer))
						result = "��ǻ�Ͱ� �̰���ϴ�.";
					
					else if("����".equals(computer))
						result = "����ڰ� �̰���ϴ�.";
							
				}
				
				else if("��".equals(player)) {
					
					if("��".equals(computer))
						result = "�����ϴ�.";
					
					else if("����".equals(computer))
						result = "��ǻ�Ͱ� �̰���ϴ�.";
					
					else if("����".equals(computer))
						result = "����ڰ� �̰���ϴ�.";
							
				}
				
				else
					result = "�߸� �Է��Ͽ����ϴ�! �ٽ� �Է����ּ���.";
					
			
			}
			
			System.out.println("����� = " + player + ", ��ǻ�� = " + computer + ", " + result );
			
		}
		}
	}

}
