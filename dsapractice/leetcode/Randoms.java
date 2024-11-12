import java.util.*;

public class Randoms {
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
        Arrays.sort(array);

        int l = 0, r = length - 1;
        while (l < r) {
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++; r--;
        }

        return array;
    }
}