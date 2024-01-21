//ProgramToCheckNumberIsPalindromeOrNotUsingIteration//

import java.util.Scanner;

public class ProgramToCheckNumberIsPalindromeOrNotUsingIteration 
{
    public static void main(String[] args) 
    {
        int tempvar;
        int remainder;
        int reverseNum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");  
        int originalNum= sc.nextInt();  
        tempvar = originalNum;

        while (tempvar != 0) 
        {
            remainder = tempvar % 10;
            reverseNum = reverseNum * 10 + remainder;
            tempvar /= 10;
        }

        if (originalNum == reverseNum)
        {
            System.out.print("Number is Palindrom");  
        }
        else
        {
	        System.out.print("Number is not Palindrom");
        }
    }
}
