public class ProgramToSwapTwoNumbersWithoutUsingThirdVariable 
{
    public static void main(String[] args) 
    {
        int A;
        int B;
        A = 30;
        B = 20;

        System.out.println("Before Swaping the Value of A is : "+A);
        System.out.println("Before Swaping the Value of B is : "+B);
        System.out.println("\n");
        
        A = A+B;
        B = A-B;
        A = A-B;

        System.out.println("After Swaping the Value of A is : "+A);
        System.out.println("After Swaping the Value of B is : "+B);
    }
}
