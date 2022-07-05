import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Bubble sort");
        System.out.println("Before sort: " + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("After sort: " + Arrays.toString(a));

        int[] b = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Selection sort");
        System.out.println("Before sort: " + Arrays.toString(b));
        selectionSort(b);
        System.out.println("After sort: " + Arrays.toString(b));

        int[] c = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Insertion sort");
        System.out.println("Before sort: " + Arrays.toString(c));
        insertionSort(c);
        System.out.println("After sort: " + Arrays.toString(c));

        int[] d = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Merge sort");
        System.out.println("Before sort: " + Arrays.toString(d));
        mergeSort(d, 0, d.length - 1);
        System.out.println("After sort: " + Arrays.toString(d));
    }

    public static void bubbleSort(int[] list) {
        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < (list.length - i); j++) {
                // Swapping
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            int currentMinIndex = i;
            int currentMinElement = list[i];

            // Looking for the minimum
            for (int j = i + 1; j < list.length; j++) {
                if (currentMinElement > list[j]) {
                    currentMinIndex = j;
                    currentMinElement = list[j];
                }
            }

            // Swapping
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMinElement;
            }
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {

            int currentElement = list[i];
            int j = i - 1;

            // Shifting
            while (j >= 0 && currentElement < list[j]) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = currentElement;
        }
    }

    public static void mergeSort(int[] list, int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = (low + high) / 2;

            // Sort first and second halves
            mergeSort(list, low, mid);
            mergeSort(list, mid + 1, high);

            // Merge the sorted halves
            merge(list, low, mid, high);
        }
    }

    public static void merge(int[] list, int low, int mid, int high) {
        // Find sizes of two subarrays to be merged
        final int SIZE_ONE = mid - low + 1;
        final int SIZE_TWO = high - mid;

        // Create temporary arrays
        int left[] = new int[SIZE_ONE];
        int right[] = new int[SIZE_TWO];

        // Copy data to temporary arrays
        for (int i = 0; i < SIZE_ONE; ++i)
            left[i] = list[low + i];
        for (int j = 0; j < SIZE_TWO; ++j)
            right[j] = list[mid + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = low;
        while (i < SIZE_ONE && j < SIZE_TWO) {
            if (left[i] <= right[j]) {
                list[k] = left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of left[] if any
        while (i < SIZE_ONE) {
            list[k] = left[i];
            i++;
            k++;
        }
        // Copy remaining elements of right[] if any
        while (j < SIZE_TWO) {
            list[k] = right[j];
            j++;
            k++;
        }
    }
}