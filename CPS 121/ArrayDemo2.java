/**************************
 * Name : Kirtankumar Patel
 * Date : April 20,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 7-2
 ***************************/
import java.util.Scanner;

public class ArrayDemo2
{
    public static void main(String [] args)
    {
        final int EMPLOYEES = 3;           // Number of employees
        int[] hours = new int[EMPLOYEES];  // Array of hours

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " +
                EMPLOYEES + " employees.");

        // Get the hours for each employee.
        for (int index = 0; index < EMPLOYEES; index++)
        {
            System.out.print("Employee " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }

        System.out.println("The hours you entered are:");

        // Display the values entered.
        for (int index = 0; index < EMPLOYEES; index++)
            System.out.println(hours[index]);

    }
}