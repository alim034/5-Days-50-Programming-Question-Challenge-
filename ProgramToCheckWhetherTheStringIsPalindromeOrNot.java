// ProgramToCheckWhetherTheStringIsPalindromeOrNot //

import java.util.*;  

public class  ProgramToCheckWhetherTheStringIsPalindromeOrNot
{  
    public static void main(String[] args) 
    {  
        Scanner sc= new Scanner(System.in);
        System.out.print("Please give First String : ");  
        String str= sc.nextLine();  
        StringBuilder strRev = new StringBuilder();
        strRev.append(str);
        strRev = strRev.reverse(); 
        if(str.equals(strRev.toString())){
            System.out.print("String is palindrom"); 
        }else{
            System.out.print("String is not palindrom"); 
        }
    }  
}   