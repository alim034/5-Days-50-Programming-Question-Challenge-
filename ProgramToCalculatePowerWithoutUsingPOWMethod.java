// ProgramToCalculatePowerWithoutUsingPOWMethod //

import java.util.*;
public class ProgramToCalculatePowerWithoutUsingPOWMethod
{
    public static void main(String[] args) 
    {
    int base;
    int exponent;
    int result=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give the base number");
    base= sc.nextInt();
    System.out.println("Please give the exponent number");
    exponent= sc.nextInt();
    System.out.println(base+" to the power "+exponent);
    
    while (exponent != 0) 
    {
        result = base * result;
        --exponent;
    }
    System.out.println(result);
    }
}