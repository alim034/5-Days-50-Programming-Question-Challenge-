// ProgramToConvertFahrenheitIntoCelsius //

import java.util.*;

public class ProgramToConvertFahrenheitIntoCelsius
{
    public static void main(String[] args) 
    {
        float celsius;
        float fahrenheit;
        System.out.println("Program to convert Fahrenheit to Celsius" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the Fahrenheit Temperature");
        fahrenheit= sc.nextFloat();
        celsius = ((fahrenheit-32)*5)/9;
        System.out.printf("Celsius = %.2f",celsius);
    }
}