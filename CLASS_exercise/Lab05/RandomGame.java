import java.util.Scanner;

public class RandomGame {
	Scanner scanner = new Scanner(System.in);
	
	protected Person [] p = new Person[2];
	
	
	public RandomGame() {
		for(int i=0; i<p.length; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			p[i] = new Person(scanner.nextLine());
		}
	}
	
	public void run() {
		
		int i=0;
		
		while (true) {
			
			if (p[i].turn()) {
				System.out.println(p[i].getName()+"님이 이겼습니다!");
				break;
			}
			
			else {
				System.out.println("아쉽군요!");
				i=i+1;
				i = i%p.length;
		}}}
	
	
		public static void main(String [] args) {
			
			RandomGame game = new RandomGame();
			game.run();
			
		}
}