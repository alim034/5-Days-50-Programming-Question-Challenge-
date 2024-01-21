 // ProgramToCheckCharacterIsVowleOrComposite //


 import java.util.*;
public class ProgramToCheckCharacterIsVowleOrComposite
{
  public static void main (String[]args)
  {
    System.out.println("Java program to check given character is vowel or consonant");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Please enter a character");
    char ch = sc.next ().charAt (0);
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
      {
	    if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
	        || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
	             System.out.println ("Given Character " + ch + " is a vowel.\n");

	    else
	            System.out.println ("Given Character " + ch + " is a consonant.\n");

      }
     else
        System.out.println ("Given Character " + ch +" is neither a vowel nor a consonant.\n");
  }
}