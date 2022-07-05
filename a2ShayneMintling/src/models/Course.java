package models;

import java.util.ArrayList;

/**
 * Course blueprint.
 *
 * @author Agatha Owora
 */
public class Course {

    /**
     * Course name.
     */
    private String name;
    /**
     * Students enrolled in a course.
     */
    private ArrayList<Student> courseStudentList;
    /**
     * Maximum number of students that can be enrolled in a course.
     */
    public static final int MAX = 3;

    /**
     * Method to create a course.
     * Create the courseStudentList ArrayList so that a course starts off with no students enrolled.
     * Set the course name assuming the name will be 1 word.
     * Check that the name is not null or empty.
     *
     * @param name course name.
     */
    public Course(String name) {
        courseStudentList = new ArrayList<Student>();
        setName(name);
    }

    /**
     * Method to retrieve the current course name.
     *
     * @return current course name.
     */
    public String getName() {
		return name;
    }

    /**
     * Method to set the course name.
     * If the course name is null or an empty string, set the name to "Nothing".
     *
     * @param name current course name.
     */
    public void setName(String name) {
		if(name==null || name.equals("")){
		    this.name = "Nothing";
        } else{
		    this.name = name;
        }
    }

    /**
     * Method to add a student to the course.
     * If the course is full, do not add the student to the course but return the string "Full course!".
     * If not full, add the student to the course by adding them to the courseStudentList and return "Student enrolled!".
     *
     * @param student student being added to the course.
     * @return string value describing the result of the operation.
     */
    public String addStudent(Student student) {
        if (courseStudentList.size() >= Course.MAX){
            return "Full course!";
        }else {
            courseStudentList.add(student);
            return "Student enrolled!";
        }
    }

    /**
     * Method to drop a student from the course.
     * If the course is empty, do not drop the student from the course but return the string "Empty course!".
     * If not empty, drop the student from the course and return the string "Student dropped!".
     *
     * @param student student being added to the course.
     * @return string value describing the result of the operation.
     */
    public String dropStudent(Student student) {
		if (courseStudentList.size() == 0 || !courseStudentList.contains(student)){
		    return "Empty course!";
        }else {
		    courseStudentList.remove(student);
		    return "Student dropped!";
        }
    }

    /**
     * Method that gives you access to the students enrolled in the course.
     *
     * @return ArrayList containing all the students enrolled in the course.
     */
    public ArrayList<Student> getCourseStudentList() {
		return courseStudentList;
    }
}