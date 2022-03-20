/**************************
 * Name : Kirtankumar Patel
 * Date : March 19,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code listing 4-8
 ***************************/
import java.util.Scanner;

public class UserSquares
{
    public static void main(String[] args)
    {
        int number;         // Loop control variable
        int maxValue;       // Maximum value to display

        System.out.println("I will display a table of " + "numbers and their squares.");

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the maximum value to display.
        System.out.print("How high should I go? ");
        maxValue =  keyboard.nextInt();

        // Display the table
        System.out.println("Number Number Sqaured");
        System.out.println("-----------------------");

        for (number = 1; number <= maxValue; number++)
        {
            System.out.println(number + "\t\t" + number * number);
        }

    }
}