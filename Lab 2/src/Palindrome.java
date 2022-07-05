public class Palindrome {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        for (int i = 0; i < args.length; i++) {
            if (isPalindrome(args[i])) {
                System.out.println(args[i] + " is a palindrome");
            } else {
                System.out.println(args[i] + " is not a palindrome");
            }
        }
    }

    private static boolean isPalindrome(String input) {
        StringBuilder word = new StringBuilder();
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            if (Character.isLetter(lower.charAt(i))) {
                word.append(lower.charAt(i));
            }
        }

        for (int i = 0; i <= word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}