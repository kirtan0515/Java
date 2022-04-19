/**************************
 * Name : Kirtankumar Patel
 * Date : April 12,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 9-2
 ***************************/
import javax.swing.JOptionPane;

public class CustomerNumber
{
    public static void main(String[] args)
    {
        String input;

        //get a customer number.
        input = JOptionPane.showInputDialog("Enter " +
                "a customer number in the form LLLNNNN\n" +
                "(LLL = letters and NNNN = nummbers)");

        //validate the input.
        if (isValid(input))
        {
            JOptionPane.showMessageDialog(null,
                    "Thats a valid customer number.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "That is not the proper format of a " +
                            "customer number.\nHere is an " +
                            "example: ABC1234");
        }

        System.exit(0);
    }

    private static boolean isValid(String custNumber)
    {
        boolean goodSoFar = true;
        int i = 0;

        //test the length
        if(custNumber.length() != 7)
            goodSoFar = false;

        //test the first three characters for letters.
        while (goodSoFar && i < 3)
        {
            if (!Character.isLetter(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }

        //test the last four characers for digits.
        while (goodSoFar && i < 7)
        {
            if (!Character.isDigit(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }

        return goodSoFar;

    }
}