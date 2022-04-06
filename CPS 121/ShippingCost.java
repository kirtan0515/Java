/**************************
 * Name : Kirtankumar Patel
 * Date : April 5,2022
 * Prof : Dr. Rodney Clark
 * Desc : Shipping Cost Scanner
 ***************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ShippingCost
{
    public static void main(
            String[] args
    )
    {

        double weight = 0.0;                      // Weight of the Package
        double l,w,h,area;                        // Dimensions for Determination
        int zipCode;                              // Zip - Code
        double cost = 0.0;                        // Cost
        double sCharge = 0.0;                     // Surcharge

        // Input From User
        l       = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Length"));
        w       = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Width"));
        h       = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Height"));
        zipCode = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Zip - Code"));
        weight  = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Weight"));


        area = l * w * h;                         // Calculate the area

        if(weight <= 5)                           // First Case 1.a
        { cost = 12.00; }

        if(area > 5 && area <= 15)                // First Case 1.b
        { cost = 14.00; }

        if(area > 15&& area <= 30)                // First Case 1.b
        { cost = 21.00; }

        if(area > 30 && area <= 45)               // First Case 1.b
        { cost = 34.00; }

        if(area > 45 && area <= 60)                // First Case 1.b
        { cost = 50.00; }

        if(area > 60)                             // First Case 1.b
        { cost = 105.00; }

        int z = zipCode / 10000;
        if(z == 4)                                // Gets First Digit because of Int
        { sCharge = cost * 0.05; }
        if(z == 6)
        { sCharge = cost * 0.07; }
        else
        { sCharge = cost * 0.09; }

        if(zipCode % 2 == 0)                      // If the ZipCode is Even
        { sCharge = cost * 0.02; }

        // Output Message
        String output =  "Surcharge(s) : $ " + sCharge +"\n" +
                "Zip Code     :   " + zipCode +"\n" +
                "Cost         : $ " + cost +"\n" +
                "Weight       :   " + weight + "\n" +
                "--------------------------" + "\n" +
                "Total Cost   : $ " + (cost + sCharge);

        // Output
        JOptionPane.showMessageDialog(null,output);
    }
}