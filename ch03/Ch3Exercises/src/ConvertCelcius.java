/**Exercise 3-2
 * Converts Double user input from Celcius to Fahrenheit
 * 1. Prompt the user for input
 * 2. Read a double value from standard input
 * 3. Calculate result
 * 4. Format the output to one decimal place
 *
 * Formula: F = C(9/5) + 32
*/

import java.util.Scanner;

public class ConvertCelcius{

    public static void main(String[] args){
        double celcius;
        double fahrenheit;
        System.out.println("Please Enter a Temperature in Celcius");
        Scanner scanner = new Scanner(System.in);
        celcius = scanner.nextDouble();
        fahrenheit = convertCelcius(celcius);

        System.out.println(celcius + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit");
    }

    public static double convertCelcius(double celcius){
        double fahrenheit;

        return fahrenheit = (celcius * (9.0/5.0)) + 32.0;
    }
}