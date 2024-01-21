// ProgramToCalculateSmallestAmongThreeNumbers//

import java.util.*;
public class  ProgramToCalculateSmallestAmongThreeNumbers
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the first number");
        a= sc.nextInt();
        System.out.println("Please give the second number");
        b= sc.nextInt();
        System.out.println("Please give the third number");
        c= sc.nextInt();

        if(a<=b && a<=c)
        {
            System.out.println("a is smallest");
        }
        if(b<=a && b<=c)
        {
            System.out.println("b is smallest");
        }
        if(c<=a && c<=b)
        {
            System.out.println("c is smallest");
        }

    }
}