// For more methods check (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html)
import java.util.Arrays; // Needed for the Arrays methods to work.
public class ArrayHelp {
    public static void main(String[] args) {
        int[] a = {20, 30, 10};
        int[] b = new int[3];

        // Method to fill an array with values
        Arrays.fill(b, 2);                      //  b = {2, 2, 2}

        // Method to print all the elements in an array
        System.out.println(Arrays.toString(a));     // [20, 30, 10]

        // Method to check 2 arrays are equal (have the same size and identical elements in each index)
        System.out.println(Arrays.equals(a, b));    // false

        // Method that performs a binary search to look for an element in an array
        System.out.println("Index for element 20 = " + Arrays.binarySearch(a, 20));  //  Index for element 20 = 0

        // Method to sort the elements in the array
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));     // [10, 20, 30]
    }
}
