/**************************
 * Name : Kirtankumar Patel
 * Date : April 20,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 7-4
 ***************************/
public class ArrayInitialization
{
    public static void main(String[] args)
    {
        int[] days = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        for (int index = 0; index < 12; index++)
        {
            System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
        }
    }
}