// ProgramToCalculateFactorialOfNumber //

import java.util.*;
public class ProgramToCalculateFactorialOfNumber 
{
    public static void main(String[] args) 
    {
    long i;
    long num;
    long factorial=1;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to calculate factorial: ");
    num = sc.nextInt();

    if(num<0)
    {
        System.out.println("Factorial can't be calculated for negative number");
    }
    else if(num==0)
    {
       System.out.println("Factorial of 0 is 1");
    }
    else
    {
        for(i=1;i<=num;i++)
          factorial=factorial*i;
        System.out.println("Factorial = "+factorial);
    }
    }
}