import java.util.Arrays; // Needed for Arrays.binarySearch

public class Searching {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        System.out.println("Linear search");
        System.out.println(linearSearch(a, 0)); // -1
        System.out.println(linearSearch(a, 1)); // 0
        System.out.println(linearSearch(a, 2)); // 1
        System.out.println(linearSearch(a, 3)); // 2
        System.out.println(linearSearch(a, 4)); // 3
        System.out.println(linearSearch(a, 7)); // -1

        System.out.println("Binary search");
        System.out.println(binarySearch(a, 0)); // -1
        System.out.println(binarySearch(a, 1)); // 0
        System.out.println(binarySearch(a, 2)); // 1
        System.out.println(binarySearch(a, 3)); // 2
        System.out.println(binarySearch(a, 4)); // 3
        System.out.println(binarySearch(a, 7)); // -1

        System.out.println("Recursive binary search");
        System.out.println(recursiveBinarySearch(a, 0)); // -1
        System.out.println(recursiveBinarySearch(a, 1)); // 0
        System.out.println(recursiveBinarySearch(a, 2)); // 1
        System.out.println(recursiveBinarySearch(a, 3)); // 2
        System.out.println(recursiveBinarySearch(a, 4)); // 3
        System.out.println(recursiveBinarySearch(a, 7)); // -1

        // Code for the built-in Java Binary search has been placed below as a comment
        System.out.println("Built-in binary search");
        System.out.println(Arrays.binarySearch(a, 0)); // -1
        System.out.println(Arrays.binarySearch(a, 1)); // 0
        System.out.println(Arrays.binarySearch(a, 2)); // 1
        System.out.println(Arrays.binarySearch(a, 3)); // 2
        System.out.println(Arrays.binarySearch(a, 4)); // 3
        System.out.println(Arrays.binarySearch(a, 7)); // -5
    }

    public static int linearSearch(int[] element, int key) {
        for (int index = 0; index < element.length; index++) {
            if (key == element[index]) {
                return index;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] element, int key) {
        int low = 0;
        int high = element.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == element[mid]) {
                return mid;
            } else if (key < element[mid]) {
                high = mid - 1;
            } else if (key > element[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }

    // It's recommended to use recursive helper methods when dealing with arrays
    public static int recursiveBinarySearch(int[] element, int key) {
        int low = 0;
        int high = element.length - 1;
        return recursiveBinarySearch(element, key, low, high);
    }

    private static int recursiveBinarySearch(int[] element, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (key < element[mid]) {
            return recursiveBinarySearch(element, key, low, mid - 1);
        } else if (key > element[mid]) {
            return recursiveBinarySearch(element, key, mid + 1, high);
        } else {
            return mid;
        }
    }

    /* --- Built in version of the binary search
    public static int binarySearch(int[] element, int key) {
        int low = 0;
        int high = element.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == element[mid]) {
                return mid;
            } else if (key < element[mid]) {
                high = mid - 1;
            } else if (key > element[mid]) {
                low = mid + 1;
            }
        }

        return -low - 1;
    }
     */
}