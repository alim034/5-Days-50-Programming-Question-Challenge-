//ProgramToPrintFibonacciSeriesUsingRecursion//

import java.util.Scanner;

public class ProgramToPrintFibonacciSeriesUsingRecursion 
{
    public static void main(String[] args) 
    {
         int i;
         int k; 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");  
        int n= sc.nextInt();
        System.out.println("fibonacci series is: "); 

	    for(i=0;i<n;i++) 
        { 
		    System.out.println(ProgramToPrintFibonacciSeriesUsingRecursion.fibonacci(i));
	    }
    }

    static int fibonacci(int i)
    { 
	    if(i==0) 
        {
            return 0; 
        }
	    else if(i==1) 
        {
            return 1;
        } 
	    else
        {
             return (fibonacci(i-1)+fibonacci(i-2));
        }
    }
}
