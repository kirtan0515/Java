/**************************
 * Name : Kirtankumar Patel
 * Date : April 12,2022
 * Prof : Dr. Rodney Clark
 * Desc : Code Listing 9-1
 ***************************/
import javax.swing.JOptionPane;

public class CharacterTest
{
    public static void main(String[] args)
    {
        String input;
        char ch;

        //get a character from the user and store
        // it in the ch variable
        input = JOptionPane.showInputDialog("Enter " + " any single character.");
        ch = input.charAt(0);

        //test the character
        if(Character.isLetter(ch))
        {
            JOptionPane.showMessageDialog(null, "That is a letter.");
        }
        if (Character.isDigit(ch))
        {
            JOptionPane.showMessageDialog(null,"That is a digit.");
        }
        if (Character.isLowerCase(ch))
        {
            JOptionPane.showMessageDialog(null,"That is a loweercase letter.");
        }
        if (Character.isUpperCase(ch))
        {
            JOptionPane.showMessageDialog(null,"That is a uppercase letter.");
        }
        if (Character.isSpaceChar(ch))
        {
            JOptionPane.showMessageDialog(null,"That is a space.");
        }
        if (Character.isWhitespace(ch))
        {
            JOptionPane.showMessageDialog(null,"That is a whitespace character.");
        }
        System.exit(0);
    }
}