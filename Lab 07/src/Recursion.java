/**
 * No loops or fields are allowed in this file.
 * Solve these methods using only recursion.
 *
 * @author Agatha Owora
 */
public class Recursion {

    /**
     * Main method to test the other methods.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Testing the power method
        System.out.printf("3 ^ 2 = %.2f \n", power(3, 2));                        // 3 ^ 2 = 9.00
        System.out.printf("3 ^ -2 = %.2f \n", power(3, -2));                      // 3 ^ -2 = 0.11
        System.out.printf("-2 ^ 3 = %.2f \n", power(-2, 3));                      // -2 ^ 3 = -8.00
        System.out.printf("2 ^ 0 = %.2f \n", power(2, 0));                        // 2 ^ 0 = 1.00

        // Testing the ears method
        System.out.println();
        System.out.println("Total number of ears for 0 creatures = " + ears(0));    // Total number of ears for 0 creatures = 0
        System.out.println("Total number of ears for 1 creature = " + ears(1));     // Total number of ears for 1 creature = 3
        System.out.println("Total number of ears for 2 creatures = " + ears(2));    // Total number of ears for 2 creatures = 5

        // Testing the sum method
        System.out.println();
        System.out.println("Sum of digits in 126 = " + sum(126));                       // Sum of digits in 126 = 9
        System.out.println("Sum of digits in 40 = " + sum(40));                         // Sum of digits in 40 = 4
    }

    /**
     * Method to return the value of a number raised to a power.
     *
     * @param num number.
     * @param pow power a number is being raised to.
     * @return num raised to the power pow.
     */
    public static double power(int num, int pow) {
       if (pow == 0) {
           return 1.00;
       }
       if(pow < 0){
           return 1/power(num,-pow);
        }else{
           if(pow%2== 1) {
               return (num * power(num, pow / 2) * power(num, pow / 2));
           }else{
               return (num * power(num, pow-1));
            }
        }
    }
    /**
     * Method to count the total number of ears a set of creatures has.
     * Assume the creatures are standing in a line with numbers attached to them 1, 2, 3, ...
     * If the creature number is an even number, it should be treated as a human .Humans have 2 ears.
     * If the creature number is an odd number, it should be treated as an alien. Aliens have 3 ears.
     *
     * @param creatures total number of creatures whose ears we have to count.
     * @return total number of ears for the set of creatures.
     */
    public static int ears(int creatures) {
        if (creatures > 0) {
            if (creatures%2 == 0) {
                return 2 + ears(creatures - 1);
            } else if (creatures%2 == 1) {
                return 3 + ears(creatures - 1);
            } else {
                return 1 + ears(creatures - 1);
            }
        }return 0;
    }

    /**
     * Method to determine the sum of individual digits in a positive number.
     *
     * @param num the positive number.
     * @return the sum of the individual digits in the number.
     */
    public static int sum(int num) {
        if(num == 0){
            return 0;
        }else{
            return num%10 + sum(num/10);
        }
    }
}