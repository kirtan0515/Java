/**************************
 * Name : Kirtankumar Patel
 * Date : April 12,2022
 * Prof : Dr. Rodney Clark
 * Desc : Standardized Test Scores
 ***************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class StandardizedTestScores {

    public static void main(
            String[] args
    )

    {
        // create object
        TestGrades ts = new TestGrades();
        // call inputBox method to take inputs from user
        int[] grades = ts.inputBox();

        // call displayGrade method to display grades
        ts.displayGrades(grades);
    }

    // this method takes input from user and return an array of Grades
    int[] inputBox() {
        int[] grades = new int[10];
        int i;
        String input;

        // ask user for input 10 test grades
        try {
            for (i = 0; i < 10; i++) {
                input = JOptionPane.showInputDialog("Enter grades of Test " + (i + 1) + " ");
                grades[i] = Integer.valueOf(input);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        // return array
        return grades;
    }

    // define method to display grades, and calculate average, highest and lowest grade
    // this method take grades array as parameter
    void displayGrades(int[] grades) {
        int i, total = 0;
        int high = 0, low = grades[0];
        // display grades
        System.out.println("\nThis are all the test grades");
        System.out.println("==========================================");
        for (i = 0; i < 10; i++) {
            System.out.print(grades[i] + "\t");
            total = total + grades[i];

            // calculate highest-grade number
            if (high < grades[i]) {
                high = grades[i];
            }

            // calculate lowest-grade number
            if (low > grades[i]) low = grades[i];
        }

        // display average grades
        System.out.println("\nThe total average of grades");
        System.out.println("==========================================");
        System.out.println((total / 10));
        System.out.println("\nThe Highest-Grade number is: " + high);
        System.out.println("\nThe Lowest-Grade number is: " + low);
    }
}