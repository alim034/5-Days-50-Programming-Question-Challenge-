// ProgramToConvertCelsusIntoFahrenheit//

import java.util.*;
public class ProgramToConvertCelsusIntoFahrenheit
{
    public static void main(String[] args) 
    {
        float celsius, fahrenheit;
        System.out.println("Program to convert Celsius to Fahrenheit" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the Celsius Temperature");
        celsius= sc.nextFloat();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Fahrenheit = %.2f",fahrenheit);
    }
}
