// ProgramToCheckGivenStringIsAnagramsOrNot //

import java.util.*;  

public class ProgramToCheckGivenStringIsAnagramsOrNot
{  
    public static void main(String[] args)
    {  
        Scanner sc= new Scanner(System.in);
        System.out.print("Please give First String : ");  
        String str1= sc.nextLine();  
        Scanner sc1= new Scanner(System.in);
        System.out.print("Please give Second String : ");  
        String str2= sc.nextLine();

        if(anagramCheck(str1,str2))
        {
            System.out.print("String are anagram"); 
        }
        else
        {
            System.out.print("String are not anagram"); 
        }
    }  

    public static boolean anagramCheck(String str1, String str2)
    {
        boolean status = false;

        if (str1.length() != str2.length()) 
        {  
            status = false;  
        } 
        else 
        {  
            char[] arr1 = str1.toLowerCase().toCharArray();  
            char[] arr2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            status = Arrays.equals(arr1, arr2);  
        }  
        return status;
     }
}  