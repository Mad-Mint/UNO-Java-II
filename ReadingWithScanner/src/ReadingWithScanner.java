import java.util.Arrays;
import java.util.Scanner;

public class ReadingWithScanner {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); //to take userInput by ourselves
        //System.out.println("Enter the length of the array:");
        //int length = s.nextInt(); // nextInt() means to take an integer value by user;
        int [] myArray = new int[5];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<myArray.length; i++ ) {
            myArray[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }
}

