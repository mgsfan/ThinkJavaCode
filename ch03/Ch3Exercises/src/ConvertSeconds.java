/**Exercise 3-3
 * Converts Integer user input from seconds to hours, minutes, and seconds
 * 1. Prompt the user for input
 * 2. Read an integer value from standard input
 * 3. Calculate result
 * 4. Use printf to display the output
 * 4a. Display: "5000 seconds = 1 hours, 23 minutes, and 20 seconds"
 */

import java.util.Scanner;

public class ConvertSeconds{

    public static void main(String[] args){
        int hours;
        int minutes;
        int secondsInput;
        int seconds;
        System.out.print("Please Enter the Seconds to Convert: ");
        Scanner scanner = new Scanner(System.in);
        secondsInput = scanner.nextInt();
        scanner.nextLine();

        hours = secondsInput / 3600;
        minutes = secondsInput % 3600 / 60;
        seconds = secondsInput % 3600 % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.\n", secondsInput, hours, minutes, seconds);
    }
}