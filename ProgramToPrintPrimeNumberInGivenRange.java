// ProgramToPrintPrimeNumberInGivenRange //

import java.util.*;
public class ProgramToPrintPrimeNumberInGivenRange 
{
    public static void main(String[] args) 
    {
    int i=0;
    int fNum;
    int sNum; 
    int temp;
    int temp1=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give the first number");
    fNum= sc.nextInt();
    System.out.println("Please give the second number");
    sNum= sc.nextInt();
    System.out.println("Prime numbers in range "+fNum+ " and " +sNum+"are");

    while(fNum<=sNum)
    {
        temp=0;
        for(i=2;i<=(fNum/2);i++)
        {
            if(fNum%i==0)
            {
                temp=1;
                break;
            }
        }
        if(temp==0)
            System.out.println(fNum);
        fNum++;
    }

    }
}