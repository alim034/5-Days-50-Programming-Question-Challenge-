// ProgramToCalculatePowerUsingPOWMethod //

import java.util.*;
public class ProgramToCalculatePowerUsingPOWMethod
{
    public static void main(String[] args) 
    {
        int base;
        int exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the base number");
        base= sc.nextInt();
        System.out.println("Please give the exponent number");
        exponent= sc.nextInt();

        System.out.println(base+" to the power "+exponent);
        double result = Math.pow(base, exponent);
        System.out.println(result);
    }
}