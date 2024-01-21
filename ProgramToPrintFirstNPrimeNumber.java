//ProgramToPrintFirstNPrimeNumber //

import java.util.*;
public class ProgramToPrintFirstNPrimeNumber
{
public static void main(String[] args) 
{
    int i=0;
    int n;
    int temp;
    int temp1=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Give input to find Prime number before ");
    n= sc.nextInt();
    System.out.println("Prime numbers are before "+n);

    while(temp1<=n){

        temp=0;
        for(i=2;i<=(temp1/2);i++)
        {
            if(temp1%i==0)
            {
                temp=1;
                break;
            }
        }
        if(temp==0)
        {
            System.out.println(temp1);
        }
        temp1++;
        }
    }
}