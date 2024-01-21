// ProgramToCocatenateTwoStrings //


import java.util.*;

public class ProgramToCocatenateTwoStrings

{
    public static void main (String[]args)
    {
        System.out.println("Java program to concatenate String using +");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter First String");
        String str1 = sc.nextLine(); 
        System.out.println ("Please enter Second String");
        String str2 = sc.nextLine();
        String str3 = str1 + str2;
        System.out.println ("Strings after concatenation = "+str3);
    }
}