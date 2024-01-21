//ProgramToAddTwoNumberWithoutUsingAdditionalOperator//

import java.util.Scanner;

public class ProgramToAddTwoNumberWithoutUsingAdditionalOperator 
{
     public static void main(String[] arg) 
	 {
	   int x;
       int y;
	   Scanner sc = new Scanner(System.in);	
	   System.out.print("Please Give first number: ");
	   x = sc.nextInt(); 
	   System.out.print("Please Give second number: ");
	   y = sc.nextInt(); 

      while(y != 0)
      {
            int temp = x & y;
            x = x ^ y;
            y = temp << 1;
        }
        System.out.print("Sum = "+x); 
	}	
} 