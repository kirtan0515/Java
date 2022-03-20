/**************************
 * Name : Kirtankumar Patel
 * Date : March 8, 2022
 * Prof : Dr. Rodney Clark
 * Desc : Welcome
 ***************************/

import javax.swing.JOptionPane;

public class PostalAddress
{
    public static void main(String[] args)
    {
        String inputString;         // For reading input
        String fname;                // The user's first name
        String lname;                // The user's last name
        String bmonth;                // The user's birth month
        String bday;                // The user's birth day
        String byear;                // The user's birth year
        String bcity;               // The user's birth city
        
        String output;

        // Get the user's first name.
        fname = JOptionPane.showInputDialog("Please enter " + "your first name: ");

        // Get the user's last name.
        lname = JOptionPane.showInputDialog("Please enter " + "your last name: ");

        // Get the user's birth month.
        bmonth = JOptionPane.showInputDialog("Please enter " + "your birth month: ");

        // Get the user's birth day.
        bday = JOptionPane.showInputDialog("Please enter " + "your birth day: ");

        // Get the user's birth year.
        byear = JOptionPane.showInputDialog("Please enter " + "your birth year: ");

        // Get the user's birth city
        //bcity

        // Create an output
        output = "Name     : " + lname + ", " + fname + "\nBirthday: " + bmonth +
                " / " + bday + " / " + byear;
        // Display the results.
        JOptionPane.showMessageDialog(null,output);

        //End the program.
        System.exit(0);
    }
}




