package menus;

import models.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class responsible for entire program.
 *
 * @author Agatha Owora
 * @see CourseMenu
 * @see StudentMenu
 */
public class MainMenu {

    /**
     * Variable responsible to enable user to enter input from the keyboard.
     */
    public static Scanner input = new Scanner(System.in);
    /**
     * ArrayList to store all the courses created.
     */
    public static ArrayList<Course> courses = new ArrayList<>();

    /**
     * ArrayList to store all the students created.
     */
    public static ArrayList<Student> students = new ArrayList<>();

    /**
     * Constructor to disable objects from being created from the class.
     */
    private MainMenu() {


    }

    /**
     * Main menu.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int response;
        do {
            response = mainMenu();
            switch (response) {
                case 1:
                    CourseMenu.menu();
                    break;
                case 2:
                    StudentMenu.menu();
                    break;
                case 3:
                    summary();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("* * * * * * * * * * * * * * * * * * * *");
                    System.out.println("END OF PROGRAM");
                    System.out.println("* * * * * * * * * * * * * * * * * * * *");
                    break;
            }
        } while (response != 4);
    }

    /**
     * Method to display the main menu.
     * The method should check if a user's input is a valid menu option.
     * If it isn't, keep asking the user for an option until they enter something valid.
     * Reference: SAMPLE OUTPUT 1
     *
     * @return the valid option selected by the user back to the main method to determine the next course of action.
     */
    private static int mainMenu() {
        System.out.println();
        System.out.print("""
                * * * * * * * * * * * * * * * * * * * *
                Main Menu
                * * * * * * * * * * * * * * * * * * * *
                Options : (1) Course menu, (2) Student menu, (3) Summary, (4) Exit
                Enter option:\s""");
        return rangeCheck(input.nextInt(), 1, 4);
    }

    /**
     * Method to display the summary of courses and students.
     * Reference: SAMPLE OUTPUT 2.
     * The instructions below are to be completed when you reach STEP 10 of the assignment instructions.
     * For each course, display the course name, students enrolled vs maximum course size, the student ID and name
     * for each student in the format shown in the sample output.
     * Reference: SAMPLE OUTPUT 8 and 10 (check SAMPLE OUTPUT 10 after completing step 12 in the lab instructions).
     * For SAMPLE OUTPUT 10, the student ID and name is what is displayed as the students enrolled in the course.
     */
    private static void summary() {
        System.out.println();
        System.out.println("""
                - - - - - - - - - - - - - - - - - - - -
                COURSE SUMMARY""");
        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);
            ArrayList<Student> v = c.getCourseStudentList();
            System.out.println("***** " + c.getName() + ": (" + v.size() + "/" + Course.MAX + ")");
            for (int d = 0; d < v.size(); d++) {
                System.out.println(v.get(d).getId() + " - " + v.get(d).getName());
            }
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Course Total: " + courses.size());
        System.out.println("Student Total: " + students.size());

    }

    /**
     * Method to check if user input is within a given set of values
     *
     * @param number user input
     * @param low    lower bound of the range
     * @param high   upper bound of the range
     * @return if it is within the range it returns the user input
     */
    public static int rangeCheck(int number, int low, int high) {
        while (number < low || number > high) {
            System.out.printf("Enter option (%d - %d): ", low, high);
            number = input.nextInt();
        }
        return number;
    }

}
