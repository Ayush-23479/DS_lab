package lab;
import java.util.Arrays;
public class Ex_6_2 {
    public class SearchOperations {
        public static int linearSearch(int[] arr, int key, int index) {
            if (index < 0 || index >= arr.length) {
                return -1; // Key not found
            }
            if (arr[index] == key) {
                return index;
            }
            return linearSearch(arr, key, index + 1);
        }

        public static int binarySearch(int[] arr, int key) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1; // Key not found
        }

        public static void main(String[] args) {
            int[] arr = {5, 10, 15, 20, 25, 30, 35, 40};
            int key = 30;

            // Linear Search (Non-Recursive)
            int linearResult = linearSearch(arr, key, 0);
            if (linearResult != -1) {
                System.out.println("Linear Search: " + key + " found at index " + linearResult);
            } else {
                System.out.println("Linear Search: " + key + " not found");
            }

            // Binary Search (Non-Recursive)
            Arrays.sort(arr); // Binary search requires a sorted Array
            int binaryResult = binarySearch(arr, key);
            if (binaryResult != -1) {
                System.out.println("Binary Search: " + key + " found at index " + binaryResult);
            } else {
                System.out.println("Binary Search: " + key + " not found");
            }
        }
    }
}
