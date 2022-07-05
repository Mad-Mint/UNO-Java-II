package models;

import java.util.ArrayList;

/**
 * Student blueprint.
 *
 * @author Agatha Owora
 */
public class Student {

    /**
     * Student ID.
     */
    private int id;
    /**
     * Student name.
     */
    private String name;
    /**
     * Static variable that gets incremented by 1 everytime a new student is created.
     */
    private static int count;
    /**
     * Courses a student is enrolled in.
     */
    private ArrayList<Course> studentCourseList;

    /**
     * Method to create a student.
     * Create the studentCourseList ArrayList so that a student starts off with no courses they are enrolled in.
     * Set the student name assuming the name will be 1 name.
     * Check that the name is not null or empty.
     * Increment the count by 1.
     * Set the student ID to the current count value.
     *
     * @param name student name.
     */
    public Student(String name) {
        studentCourseList = new ArrayList<Course>();
        setName(name);
        count++;
        id = count;
    }

    /**
     * Method to retrieve the current student ID.
     *
     * @return current student ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Method to retrieve the current student name.
     *
     * @return current student name.
     */
    public String getName() {
		return name;
    }

    /**
     * Method to set the student name.
     * If the student name is null or an empty string, set the name to "Nothing".
     *
     * @param name current student name.
     */
    public void setName(String name) {
		if (name == null || name.equals("")){
		    this.name = "Nothing";
        }else {
            this.name = name;
        }
    }

    /**
     * Method to enroll a student in a course.
     * If the course passed is null, return "Non existing course!".
     * If the course passed is one where the student is already enrolled in, return "Duplicate course!".
     * If the course is already full, the returned string will be "Full course!" (string returned from the Course class).
     * If the course isn't full and not a duplicate, add it to the studentCourseList and add the student to the course.
     * The returned string in this case will be "Student enrolled!" (string returned from the Course class).
     * If none of the above conditions are met, return null.
     *
     * @param course course student is enrolling in.
     * @return string value describing the result of the operation.
     */
    public String add(Course course) {
        String a = null;
		if (course == null){
		    a = "Non existing course!";
        }else if (studentCourseList.contains(course)){
		    a = "Duplicate course!";
        }else if (course.getCourseStudentList().size() >= Course.MAX){
            a = course.addStudent(this);
        }else {
		    studentCourseList.add(course);
		    a = course.addStudent(this);
        }
		return a;
    }

    /**
     * Method to drop a student from a course.
     * If the course passed is null, return "Error withdrawing!".
     * If the course is empty, the returned string will be "Empty course!" (string returned from the Course class).
     * If the course isn't empty, the student should be dropped from the course and removed from the studentCourseList.
     * The returned string in this case will be "Student dropped!" (string returned from the Course class).
     * If none of the above conditions are met, return null.
     *
     * @param course course to withdraw a student from.
     * @return string value describing the result of the operation.
     */
    public String drop(Course course) {
        String b = null;
        if (course == null){
            b = "Error withdrawing!";
        }else if (course.getCourseStudentList().size() == 0){
            b = "Empty course!";
        }else {
            studentCourseList.remove(course);
            b = course.dropStudent(this);
        }
		return b;
    }

    /**
     * Method that gives you access to the courses a student is enrolled in.
     *
     * @return ArrayList containing all the courses a student is enrolled in.
     */
    public ArrayList<Course> getStudentCourseList() {
		return studentCourseList;
    }

    /**
     * Method to return all the courses a student is enrolled in.
     * Example: If Jane isn't enrolled in any course, return "Jane courses: []".
     * Example: If Jane is enrolled in Java, return "Jane courses: [Java]".
     * Example: If Jane is enrolled in Java and Python, return "Jane courses: [Java, Python]".
     *
     * @return string value of all the courses a student is enrolled in.
     */
    public String getStudentCourseListString() {
        String c = name + " courses: [";
       for( int i = 0; i < studentCourseList.size(); i++) {
           studentCourseList.get(i).getName();
           c = c + studentCourseList.get(i).getName() + ", ";

           if (i+1 == studentCourseList.size()){
               c = c.substring(0, c.length()-2);
           }
       }
       return c + "]";
    }
}