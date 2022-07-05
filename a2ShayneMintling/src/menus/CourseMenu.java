package menus;

import java.sql.SQLOutput;
import java.util.Collections;

import com.sun.tools.javac.Main;
import models.*;

/**
 * Course menu.
 *
 * @author Agatha Owora
 * @see MainMenu
 * @see Course
 */
public class CourseMenu {

    /**
     * Constructor to disable objects from being created from the class.
     */
    private CourseMenu() {
    }

    /**
     * Method to display the main course menu.
     * This method should only display the course menu options, and call the other methods based off which option the
     * user has selected.
     * There must be a check that the user enters a valid menu option.
     * Reference: SAMPLE OUTPUT 3
     */
    public static void menu() {
        System.out.print("""
                                
                * * * * * * * * * * * * * * * * * * * *
                COURSE MENU
                * * * * * * * * * * * * * * * * * * * *""");
        int options;
        do {
            System.out.println();
            System.out.println("OPTIONS: (1) Add course, (2) Delete course, (3) Change course, (4) Exit menu");
            System.out.print("Enter Option: ");

            options = MainMenu.rangeCheck(MainMenu.input.nextInt(), 1, 4);
            switch (options) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    deleteCourse();
                    break;
                case 3:
                    changeCourse();
                    break;
            }
        } while (options != 4);

    }

    /**
     * Method to add a new course.
     * Ask the user for the course name.
     * If the course they enter already exists, display a message letting them know (case does not matter).
     * You should keep asking them for a course name until they enter one that doesn't exist in the list of courses.
     * If the course they enter does not exist, create a new course with the provided course name,
     * add the new course to the list of existing courses, and finally display a message letting the user know the course has been added.
     * Reference: SAMPLE OUTPUT 5
     */
    private static void addCourse() {
        System.out.print("Course Name: ");
        String course = MainMenu.input.next();
        boolean choice = false;
        do {
            for (int i = 0; i < MainMenu.courses.size(); i++) {
                if (MainMenu.courses.get(i).getName().equalsIgnoreCase(course)) {
                    System.out.println(course + " already exists!");
                    System.out.print("Course Name: ");
                    course = MainMenu.input.next();
                    choice = true;
                    break;
                } else {
                    choice = false;
                }
            }
        } while (choice);
        MainMenu.courses.add(new Course(course));
        System.out.println(course + " added!");
    }

    /**
     * Method to delete an existing course.
     * If there are no courses available, display a message letting the user know there is nothing to delete and exit out of the method.
     * Ask the user for the name of the course they want to delete.
     * If the course doesn't exist, keep asking them for the course name until they enter an existing course name.
     * Once they enter a valid course name, remove the course from the course list and let the user know the course has been deleted.
     * Reference: SAMPLE OUTPUT 6
     */
    private static void deleteCourse() {
        if (MainMenu.courses.isEmpty()) {
            System.out.println("No courses available!");
            return;
        } else {
            System.out.print("Course name: ");
            String value = MainMenu.input.next();
            while (!courseCheck(value)) {
                System.out.println(value + " does not exist!");
                System.out.print("Course Name: ");
                value = MainMenu.input.next();
            }
            for (int i = 0; i < MainMenu.courses.size(); i++) {
                if (MainMenu.courses.get(i).getName().equalsIgnoreCase(value)) {
                    MainMenu.courses.remove(i);
                    System.out.println(value + " deleted!");
                }
            }
        }
    }

    /**
     * Method to change an existing course name.
     * If there are no courses available, display a message letting the user know there is nothing to change and exit out of the method.
     * Ask the user for the name of the course they want to change (case doesn't matter).
     * If the course doesn't exist, keep asking them for the course name until they enter an existing course name.
     * Once they enter a valid course name, ask them for the new course name.
     * If they enter a name for an existing course, let them know and give them a chance to enter a new course name.
     * Once they enter a non-existing course name, change the course name and let the user know the course name has been changed.
     * Reference: SAMPLE OUTPUT 7
     */
    private static void changeCourse() {
        if (MainMenu.courses.isEmpty()) {
            System.out.println("No courses available!");
            return;
        } else {
            System.out.print("Old Course name: ");
            String valueChange = MainMenu.input.next();
            while (!courseCheck(valueChange)) {
                System.out.println(valueChange + " does not exist!");
                System.out.print("Old Course Name: ");
                valueChange = MainMenu.input.next();
            }
            System.out.print("New Course Name: ");
            String vChange = MainMenu.input.next();
            while (courseCheck(vChange)) {
                System.out.println("Course already exist!");
                System.out.print("New Course Name: ");
                vChange = MainMenu.input.next();
            }
            for (int i = 0; i < MainMenu.courses.size(); i++) {
                if (MainMenu.courses.get(i).getName().equalsIgnoreCase(valueChange)) {
                    MainMenu.courses.get(i).setName(vChange);
                    System.out.println(valueChange + " name changed!");
                    break;
                }
            }
        }

    }

    /**
     * method that checks if the course already exists
     *
     * @param course string for course name
     * @return true or false depending on if the course exists
     */
    private static boolean courseCheck(String course) {
        for (int i = 0; i < MainMenu.courses.size(); i++) {
            if (MainMenu.courses.get(i).getName().equalsIgnoreCase(course)) {
                return true;
            }
        }
        return false;
    }
}
