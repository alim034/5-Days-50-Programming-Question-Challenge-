public class ProgramToSwapTwoNumbers 
{
    public static void main(String[] args)
    {
        int A; 
        int B;
        int C;

        A = 10;
        B = 30;
        System.out.println("Before Swaping the Value of A is : "+A);
        System.out.println("Before Swaping the Value of B is : "+B);

        C = A;
        A = B;
        B =C;
        System.out.println("After Swaping the Value of A is : "+A);
        System.out.println("After Swaping the Value of B is : "+B);
    }
}
