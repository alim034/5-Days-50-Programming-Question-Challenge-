//  ProgramToCalculateLCMOfTwoNumbers //

import java.util.*;

public class ProgramToCalculateLCMOfTwoNumbers
{
    public static void main(String[] args) 
    {
        double num1;
        double num2;
        double maxNum;
        System.out.println("Java Program to calculate LCM" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give first number");
        num1= sc.nextDouble();
        System.out.println("Please give second number");
        num2 = sc.nextDouble();

        maxNum = (num1 > num2) ? num1 : num2;

        while (true) 
        {
            if (maxNum % num1 == 0 && maxNum % num2 == 0) 
            {
            System.out.println("LCM = "+maxNum );
            break;
             }
        ++maxNum;
    }
}
}
