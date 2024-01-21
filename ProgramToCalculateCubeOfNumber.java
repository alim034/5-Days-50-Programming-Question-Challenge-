// ProgramToCalculateCubeOfNumber //


import java.util.*;

public class ProgramToCalculateCubeOfNumber
{
    public static void main(String[] args) 
    {
        double num; 
        double cube;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the number to calculate cube :");
        num= sc.nextDouble();
        cube = num*num*num;
        System.out.println("Cube of "+num+" is ");
        System.out.printf("%.2f",cube);
    }
}