import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"}; //문자열 배열
		String result;
		
		while(true) {
			
		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n" + "가위 바위 보!>> ");
		String player = scanner.next(); // 문자열 읽기
		
		if("그만".equals(player)) 
			break;
		
		else {
				
			int n = (int)(Math.random()*3); // 0, 1, 2 중에서 랜덤하게 결정 
			String computer = str[n];
			
			{
				
				result = "";
			
				if("가위".equals(player)) {
					
					if("가위".equals(computer))
						result = "비겼습니다.";
					
					else if("바위".equals(computer))
						result = "컴퓨터가 이겼습니다.";
					
					else if("보".equals(computer))
						result = "사용자가 이겼습니다.";
					
				}
				
				else if("바위".equals(player)) {
					
					if("바위".equals(computer))
						result = "비겼습니다.";
					
					else if("보".equals(computer))
						result = "컴퓨터가 이겼습니다.";
					
					else if("가위".equals(computer))
						result = "사용자가 이겼습니다.";
							
				}
				
				else if("보".equals(player)) {
					
					if("보".equals(computer))
						result = "비겼습니다.";
					
					else if("가위".equals(computer))
						result = "컴퓨터가 이겼습니다.";
					
					else if("바위".equals(computer))
						result = "사용자가 이겼습니다.";
							
				}
				
				else
					result = "잘못 입력하였습니다! 다시 입력해주세요.";
					
			
			}
			
			System.out.println("사용자 = " + player + ", 컴퓨터 = " + computer + ", " + result );
			
		}
		}
	}

}
