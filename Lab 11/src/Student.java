public class Student {

    private String firstName;
    private String lastName;
    private float score;
    private char grade;

    public Student (String lastName, String firstName, float score, char grade){
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20.1f %-20c", lastName, firstName, score, grade);
    }
}