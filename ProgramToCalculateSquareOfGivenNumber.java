// ProgramToCalculateSquareOfGivenNumber //

import java.util.*;
public class ProgramToCalculateSquareOfGivenNumber
{
    public static void main(String[] args)
    {
        float num,square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the number to calculate square");
        num= sc.nextFloat();
        square = num*num;
        System.out.println("Square of "+num+" is ");
        System.out.printf("%.2f", square);
    }
}