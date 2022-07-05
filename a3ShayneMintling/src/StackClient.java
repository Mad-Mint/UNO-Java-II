
/**
 * Main program.
 *
 * @author Agatha Owora
 * @see Stack
 */
public class StackClient {
    /**
     * Main method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        System.out.println(isBalanced("()"));       // true
        System.out.println(isBalanced("(abc)"));    // true
        System.out.println(isBalanced("(a[b]cd)")); // true
        System.out.println(isBalanced("(a{b]}d)")); // false
        System.out.println(isBalanced("a([)b]"));   // false
    }

    /**
     * Method to check if a given string is balanced based off brackets (, [, {, }, ], ).
     *
     * @param string the string passed to the method.
     * @return true if balanced and false if not balanced.
     */
    public static boolean isBalanced(String string) {
        Stack queue = new Stack();
        for (int i= 0; i < string.length(); i++){
            char a = string.charAt(i);
            if(a == '(' || a == '{'|| a =='['){
                queue.push(a);
            } else if (a == ')'){
                if (queue.pop() != '('){
                    return false;
                }
            } else if (a == '}'){
                if(queue.pop() != '{'){
                    return false;
                }
            } else if (a == ']'){
                if (queue.pop() != '['){
                    return false;
                }
            }
        }return true;
    }
}
