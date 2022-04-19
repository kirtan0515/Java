/**************************
 * Name : Kirtankumar Patel
 * Date : April 12,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 9-3
 ***************************/
import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        double radius;
        double area;
        String input;
        char choice;

        //create a Scanner object to read keyboard inout.
        Scanner keyboard = new Scanner(System.in);


        do
        {
            //get the circle's radius.
            System.out.print("Enter the circle's radius: ");
            radius = keyboard.nextDouble();

            //Consume the remaining newLine character.
            keyboard.nextLine();

            //calculate and display the area.
            area  = Math.PI * radius * radius;
            System.out.printf("the area os %.2f.\n", area);

            //repeat this?
            System.out.print("Do you want to do this" +
                    "again? (Y or N) ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
        }
        while(Character.toUpperCase(choice)=='Y');
    }
}