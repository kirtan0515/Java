/**************************
 * Name : Kirtankumar Patel
 * Date : April 12,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 9-4
 ***************************/
import java.util.Scanner;

public class PersonSearch
{
    public static void main(String[] args) {
        String lookUp; // To hold a lookup string
        // Create an array of names
        String[] people = {"Cutshaw, Will", "Davis, George", "Davis, Jenny", "Russert, Phil", "Russell, Cindy", "Setzer, Charles", "Smathers, Holly", "Smith, Chris", "Smith, Brad", "Williams, Jean"};
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a partial name to search for.
        System.out.print("Enter the first few characters of " + "the last name to look up: ");
        lookUp = keyboard.nextLine();


        // Display all of the names that begin with the
        // string entered by the user.
        System.out.println("Here are the names that match:");
        for (String person : people)
        {
            if (person.startsWith(lookUp))
                System.out.println(person);

        }
    }
    }