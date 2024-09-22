import java.util.*;

public class Randoms {
    // public static void main(String[] args) {
    //     int length = 10; // Length of the array
    //     int min = 1;     // Minimum value for the random numbers
    //     int max = 100;   // Maximum value for the random numbers

    //     int[] randomArray = generateSortedRandomArray(length, min, max);

    //     // Print the sorted random array
    //     System.out.println(Arrays.toString(randomArray));
    // }

    public static int[] generateAscSortedRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];

        // Generate random numbers within the specified range
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        return array;
    }

    public static int[] generateDescSortedRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];

        // Generate random numbers within the specified range
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        // Sort the array in ascending order
        Arrays.sort(array, Collections.reverseOrder());

        return array;
    }
}