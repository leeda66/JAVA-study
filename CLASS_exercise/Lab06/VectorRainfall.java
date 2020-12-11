import java.util.*;

public class VectorRainfall {
		
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>();
		Scanner scanner =new Scanner(System.in);
		int n=1;
		
		for(int i=0;n!=0;i++) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			n= scanner.nextInt();
			if(n != 0)
				v.add(n);
			else break;

			int num=0;
			int sum=0;
			for(int j=0; j<v.size();j++) {
				sum += v.get(j);
			}
			num=sum/(v.size());
		
			for(int j=0; j<v.size();j++) {
				System.out.print(v.get(j)+" ");
			}
			System.out.println("");
			System.out.println("현재 평균값 "+num);
		}
	}
}