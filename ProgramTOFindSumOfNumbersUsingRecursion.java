//ProgramTOFindSumOfNumbersUsingRecursion//

import java.util.*;  
class ProgramTOFindSumOfNumbersUsingRecursion
{
    static int sum=0;
    static int rem;
    static int sumOfDigits(int num)
    {
            sum = sum + (num%10);
            rem = num/10;
            if(rem > 0)
            {
                sumOfDigits(rem);
            }
            return sum;
    }
    public static void main(String []args)
    {
        int result;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number: ");  
        int originalNum= sc.nextInt();  
        result = ProgramTOFindSumOfNumbersUsingRecursion.sumOfDigits(originalNum);
        System.out.println("Sum = "+result);
    }
} 