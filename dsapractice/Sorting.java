import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 1, 2, 4, 7};
        System.out.println("Original Array (before Merge Sort): " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted Array (After Merge Sort): " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if(arr.length == 1) {
            return;
        } else {
            int m = arr.length / 2, n = arr.length;
            int[] arrL = Arrays.copyOfRange(arr, 0, m);
            int[] arrR = Arrays.copyOfRange(arr, m, n);

            mergeSort(arrL); mergeSort(arrR);

            int l = 0, r = 0, i = 0;
            while(l < arrL.length && r < arrR.length) {
                if(arrL[l] < arrR[r]) {
                    arr[i] = arrL[l];
                    l++;
                } else if(arrL[l] > arrR[r]) {
                    arr[i] = arrR[r];
                    r++;
                } else {
                    arr[i] = arrL[l];
                    l++; r++;
                }
                i++;
            }
            if(l < arrL.length) {
                arr[i] = arrL[l];
            } else if(r < arrR.length) {
                arr[i] = arrR[r];
            }
        }
    }
}