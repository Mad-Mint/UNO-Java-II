import java.io.*;
import java.util.*;

/**
 * Main part of the lab.
 *
 * @author Agatha Owora
 */

public class FileLab {
    /**
     * Main method.
     *
     * @param args command line arguments.
     * @throws Exception possible file exception.
     */
    public Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {


        System.out.println(computeGrade(120));      // X
        System.out.println(computeGrade(-10));      // X
        System.out.println(computeGrade(70.5));     // C
        System.out.println(computeGrade(59.99));    // F
        System.out.println(computeGrade(90));       // A

        // ---------------------SECTION 2---------------------
        // 1: Write the code for the accessInputFile method.
        // 2: Create a Scanner object that will open the input file (you need the value returned from the accessInputFile method).
        // 3: Run and test your program to see if you get the output provided in SAMPLE 1 of the lab instructions.
        // 4: Please note the output needs to be identical. If it isn't, make the necessary corrections.

        // ---------------------SECTION 3---------------------
        // 1: Write the code for the accessOutputFile method.
        // 2: Create a PrintWriter object for the output file (you need the value returned from the accessOutputFile method).
        // 3: Run and test your program to see if you get the output provided in SAMPLE 2 of the lab instructions.
        // 4: Please note the output needs to be identical. If it isn't, make the necessary corrections.

        // ---------------------SECTION 4---------------------
        // 1: Write column titles to your "output.txt" file (go to the first row of "sample.txt" and write code that would display that text).
        // 2: With the help of a loop, read the data from the input file and use it to create student objects.
        // 3: Use the toString method in the Student class to display the data to the output file.
        // 4: Close the input and output file objects.
        // 5: Print a statement to the console letting the user know their data has been saved (refer to SAMPLE 3 of the lab instructions).
        // 5: Run your program. "output.txt" must have identical output to "sample.txt" (including the first row with column titles).
        // 6: If it doesn't, fix any errors or formatting issues.
        // 7: When done, delete all the section and method comments in this file to clean up your code.
    }

    /**
     * Method to compute the student grade according to their score.
     * If the score is less than 0 or greater than 100 return X.
     * Grades: [100, 90] - A, (90, 80] - B, (80, 70] - C, (70, 60] - D, (60, 0] - F.
     *
     * @param score student score out of 100.
     * @return letter grade corresponding to the score.
     */
    private static char computeGrade(double score) {
        if(score < 0.0 || score > 100.0){
            return 'x';
        }else if(90.0 <= score  && score <= 100.0){
            return  'A';
        }else if(80.0 <= score && score < 90.0){
            return  'B';
        }else if(70.0 <= score  && score < 80.0){
            return  'C';
        }else if(60.0 <= score && score < 70.0){
            return  'D';
        }return 'F';
    }
    /**
     * Method to grant access to the input file.
     * Ask the user for the input file name.
     * If the file doesn't exist, use a loop to keep asking them for an existing file name.
     * Be mindful of the fact that the file needs to be found in the "files" folder.
     * Refer to SAMPLE 1 of the lab instructions, on the error message to be displayed if the file doesn't exist.
     *
     * @return File object of the existing input file.
     */
    private static File accessInputFile() {
        System.out.print("Input file name: ");
        String filename = input.next();
    }

    /**
     * Method to create the output file.
     * Ask the user for the output file name.
     * If the file already exists, use a loop to keep asking them for a non-existing file name.
     * Be mindful of the fact that the file needs to be created in the "files" folder.
     * Refer to SAMPLE 2 of the lab instructions, on the error message to be displayed if the file already exists.
     *
     * @return File object of the existing input file.
     */
    private static File accessOutputFile() {
        return null;
    }
}