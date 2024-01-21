//ProgramToReverseAnInteger//

import java.util.Scanner;

public class ProgramToReverseAnInteger 
{
    public static void main(String[] args) 
    {
    int reverse=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give a number: ");
    int i = sc.nextInt(); 

	while(i!=0)
    {        
		reverse = reverse*10 + i%10;        
		i=i/10;    
	}    
    
	System.out.println("Number after reverse : "+reverse); 
    }
}
