import java.util.Scanner;

public class RandomArray {
	
	public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("정수 몇 개? ");
      
      int number = scanner.nextInt();
      int [] random = new int[number];
      
      for( int i = 0; i < number; i++ ) {
    	  
         while(true){
        	 
            int r = (int)(Math.random()*100 + 1);

            int tmp = 0;
            for(int j = 0; j <= i; j++)
               if( r == random[j])
                  tmp++;
            
            if(tmp == 0) {
               random[i] = r;
               break;
            }
         }
      }
      
      int temp = 0;
      for(int i = 0; i <number; i++) {
          
         System.out.print(random[i] + " ");
         temp++;
         if((temp % 10) == 0) {
            System.out.println(" ");
         }
      }
   }
      
   }
