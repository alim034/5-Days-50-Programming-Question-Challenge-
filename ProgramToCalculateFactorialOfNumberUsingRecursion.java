//ProgramToCalculateFactorialOfNumberUsingRecursion //

import java.util.*;
public class ProgramToCalculateFactorialOfNumberUsingRecursion
{
    static long fact(long num)
    {
        if (num == 0)
        {
            return 1;
        }
        else
        {
            return(num * fact(num-1));
        }
    }

    public static void main(String[] args)
     {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number to find Factorial ");
        num= sc.nextInt();
        System.out.println("Factorial = "+fact(num));
    }
}