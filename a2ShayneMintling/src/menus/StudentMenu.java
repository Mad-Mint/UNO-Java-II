package menus;

import models.*;

import java.util.Locale;

/**
 * Student menu.
 *
 * @author Agatha Owora
 * @see MainMenu
 * @see Student
 */
public class StudentMenu {

    /**
     * Constructor to disable objects from being created from the class.
     */
    private StudentMenu() {

    }

    /**
     * Method to display the main student menu.
     * This method should only display the student menu options, and call the other methods based off which option the
     * user has selected.
     * There must be a check that the user enters a valid menu option.
     * Reference: SAMPLE OUTPUT 4
     */
    public static void menu() {
        System.out.print("""
                                
                * * * * * * * * * * * * * * * * * * * *
                STUDENT MENU
                * * * * * * * * * * * * * * * * * * * *""");

        int options;
        do {
            System.out.println();
            System.out.println("OPTIONS: (1) Enroll student, (2) Withdraw student, (3) View student, (4) Exit");
            System.out.print("Enter Option: ");
            options = MainMenu.rangeCheck(MainMenu.input.nextInt(), 1, 4);
            switch (options) {
                case 1:
                    enroll();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    viewCourses();
                    break;
            }
        } while (options != 4);

    }

    /**
     * Method to enroll a student in a course.
     * If no courses have been created, display a message letting the user know and exit out of the method (REFERENCE: SAMPLE OUTPUT 9).
     * The instructions below are to be completed when you reach STEP 12 of the assignment instructions.
     * Display a prompt asking the user if they want to enter a new student or not.
     * 1 - If they enter 'y', ask them for the new student's name,
     * create a new student and add them to the student list in the MainMenu class.
     * Ask the user which course they want to enroll the new student.
     * - If they enter a non-existing course, do nothing and return to the Student Menu options.
     * - If they enter an existing course, enroll the student to the existing course and display a prompt letting the user know the student has been enrolled.
     * - If they enter an existing course which is already full, let the user know the course is full and return to the Student Menu options.
     * 2 - If they enter 'n', ask them for the new student's ID
     * - If they enter an ID that doesn't exist, display a prompt letting them know the student is not found and return to the Student Menu options.
     * - If they enter an ID of an existing student, ask the user which course they want to enroll the new student.
     * - If they enter a non-existing course, do nothing and return to the Student Menu options.
     * - If they enter an existing course, enroll the student to the existing course and display a prompt letting the user know the student has been enrolled.
     * - If they enter an existing course which is already full, let the user know the course is full and return to the Student Menu options.
     * 3 - If they enter neither 'y' or 'n', let them know it's an invalid response and return to the Student menu options.
     */
    private static void enroll() {
        if (MainMenu.courses.isEmpty()) {
            System.out.println("No courses available!");
            return;
        }
        System.out.print("New student (y/n): ");
        String yN = MainMenu.input.next();
        Student x = null;
        if (yN.equalsIgnoreCase("y")) {
            System.out.print("New student name: ");
            x = new Student(MainMenu.input.next());
            MainMenu.students.add(x);
            System.out.println(x.add(checkCourse()));
            return;
        } else if (yN.equalsIgnoreCase("n")) {
            x = checkStudent();
            if (x == null) {
                System.out.println("Student not found!");
                return;
            }
            Course y = checkCourse();
            if (x.getStudentCourseList().contains(y)) {
                System.out.println("Duplicate Course");
                return;
            }
            System.out.println(x.add(y));
            return;
        }
        System.out.println("Invalid Response!");
    }

    /**
     * Method to withdraw a student from a course.
     * If no courses have been created, display a message letting the user know and exit out of the method (REFERENCE: SAMPLE OUTPUT 9).
     * If no students have been created or enrolled, but courses were created, display a message letting the user know and exit out of the method (REFERENCE: SAMPLE OUTPUT 11).
     * The instructions below are to be completed when you reach STEP 13 of the assignment instructions.
     * Ask for the student's ID.
     * - If a non-existing ID is entered, let the user know the student is not found and return to the Student Menu options.
     * - If an existing ID is entered, ask the user for the course they want to withdraw the student from.
     * - If they enter a non-existing course or one the student is not enrolled in, let them know the course is not found and return to the Student Menu options.
     * - If they enter a course the student is enrolled in, drop the student from the course.
     */
    private static void withdraw() {
        if (MainMenu.courses.isEmpty()) {
            System.out.println("No courses available!");
            return;
        }
        if (MainMenu.students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }
        Student x = checkStudent();
        if (x == null) {
            System.out.println("Student not found!");
            return;
        }
        Course y = checkCourse();
        if (!x.getStudentCourseList().contains(y)) {
            System.out.println("Course not found!");
            return;
        }
        System.out.println(x.drop(y));
    }

    /**
     * Method to view the courses a student is enrolled in.
     * If no students have been created or enrolled, display a message letting the user know and exit out of the method (REFERENCE: SAMPLE OUTPUT 9).
     * The instructions below are to be completed when you reach STEP 14 of the assignment instructions.
     * Ask for the student's ID.
     * - If a non-existing ID is entered, let the user know the student is not found and return to the Student Menu options.
     * - If an existing ID is entered, display the list of all courses the student with the entered ID is enrolled in.
     */
    private static void viewCourses() {
        if (MainMenu.students.isEmpty()) {
            System.out.println("No Students available!");
            return;
        }
        Student x = checkStudent();
        if (x == null) {
            System.out.println("Student not found!");
            return;
        }
        System.out.println(x.getStudentCourseListString());
    }

    /**
     * method to check if a course the user enters is a valid course
     *
     * @return the course name object
     */
    private static Course checkCourse() {
        Course newCourse = null;
        System.out.print("Course Name: ");
        String z = MainMenu.input.next();
        for (int i = 0; i < MainMenu.courses.size(); i++) {
            if (MainMenu.courses.get(i).getName().equalsIgnoreCase(z)) {
                newCourse = MainMenu.courses.get(i);
                break;
            }
        }
        return newCourse;
    }

    /**
     * method to check if a course the user enters is a valid course
     *
     * @return the student id object
     */
    private static Student checkStudent() {
        Student newStudent = null;
        System.out.print("Student ID: ");
        int zy = MainMenu.input.nextInt();
        for (int i = 0; i < MainMenu.students.size(); i++) {
            if (MainMenu.students.get(i).getId() == zy) {
                newStudent = MainMenu.students.get(i);
                break;
            }
        }
        return newStudent;
    }
}
