public class ProgramToCheckLargestAmongThreeNumbers 
{
    public static void main(String[] args) 
    {
        int A ;
        int B;
        int C;

        A = 40;
        B = 39;
        C = 64;

        if (A>B && A>C) 
        {
            System.out.println(" A is largest among the three numbers");
        } 
        else if (B>A && B>C)
        {
            System.out.println(" B is largest among the three numbers ");
        }
        else
        {
            System.out.println("C is largest among the three numbers");
        }
    }
}
