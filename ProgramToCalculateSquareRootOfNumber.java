//  ProgramToCalculateSquareRootOfNumber //

import java.util.*;
import java.lang.Math.*;

public class ProgramToCalculateSquareRootOfNumber
{
    public static void main(String[] args) 
    {
        double num;
        double cube;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a number to calculate Square root" );
        num= sc.nextDouble();
        System.out.println("Square Root of "+num+" is ");
        System.out.printf("%.2f",Math.sqrt(num));
    }
}