
//ProgramToFindPrimeFactorialOfNumber//

import java.util.*;  
class ProgramToFindPrimeFactorialOfNumber
{
    public static void main(String []args)
    {
        int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter a number: ");  
        int n= sc.nextInt();  
        System.out.print("Prime factors of a given number n = ");  

        while(n % 2 == 0) 
        {
            System.out.print(2+",");
            n = n/2;
        }

        for(i = 3; i <= Math.sqrt(n); i=i+2)
        {
            while(n % i == 0) 
            { 
                System.out.print(i+",");
                n = n/i;
            }
        }

        if(n > 2) 
        {
            System.out.print(n+",");
        }
    }
}