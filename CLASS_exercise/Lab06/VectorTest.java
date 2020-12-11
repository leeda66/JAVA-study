import java.util.*;

public class VectorTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>();

		System.out.print("정수(-1이 입력될 때 까지)>> ");
					
		while(true) {
			int n = scanner.nextInt();
			if(n == -1)
				break;
			v.add(n);
		}
		
		
		
		System.out.print("삭제 전:[");
		for(int i=0; i<v.size();i++) {
			if(i != v.size()-1) 
				System.out.print(v.get(i)+", ");
			else 
				System.out.print(v.get(i));
		}
		System.out.println("]");
		
		
		
		int max = v.get(0);
		int k=0;
		for(int i=0; i<v.size();i++) {
			if(v.get(i)>=max) {
				max=v.get(i);
				k=i;
			}
		}
		System.out.println("가장 큰 수 "+max+" 삭제");
		v.remove(k);
		
		
		
		System.out.print("[");
		for(int i=0; i<v.size();i++) {
			if(i != v.size()-1) 
			System.out.print(v.get(i)+", ");
			else 
			System.out.print(v.get(i));
		}
		System.out.println("]");
		
		
		
		int min =v.get(0);
		int l=0;
		for(int i=0; i<v.size();i++) {
			if(v.get(i)<=min) {
				min=v.get(i);
				l=i;
			}
		}
		System.out.println("가장 작은 수 "+min+" 삭제");
		v.remove(l);
		
		
		
		System.out.print("삭제후:[");
		for(int i=0; i<v.size();i++) {
			if(i != v.size()-1) 
			System.out.print(v.get(i)+", ");
			else 
			System.out.print(v.get(i));}
		System.out.println("]");		
	}

}

