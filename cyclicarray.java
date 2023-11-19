import java.util.*;
public class cyclicarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateArray(array);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] arr) {
        if (arr.length <= 1) {
            return; // No rotation needed for empty or single-element array
        }

        int lastElement = arr[arr.length - 1];

        // Shift each element to the right starting from the end
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement; // Place the last element at the beginning
    }
}
