import java.util.*;

public class Search {
    public static void main(String[] args) {
        int[] nums = Randoms.generateAscSortedRandomArray(8, 0, 50);
        int target = 10;
        System.out.println("Simple Binary Search");
        System.out.print("Array: " + Arrays.toString(nums) + "\n Element to be searched: " + target + "\n");
        binarySearch(nums, target);

        int[] nums1 = Randoms.generateDescSortedRandomArray(8, 0, 50);
        System.out.println("Order Agnostic Binary Search");
        System.out.print("Array: " + Arrays.toString(nums) + "\n Element to be searched: " + target + "\n");
        binarySearch(nums, target);

    }

    //Simple Binary Search (Assuming ascending order sorted array)
    static void binarySearch(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while(s <= e) {
            int m = (s + e) / 2;
            if(target < nums[m]) {
                e = m - 1;
            } else if(target > nums[m]) {
                s = m + 1;
            } else {
                System.out.print("Target element " + target + " found at " + m);
                return;
            }
        }
        System.out.print("Target element " + target + " not found");
    }

    //Order Agnostic Binary Search
    static void orderAgnosticBinarySearch(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        boolean isAsc = nums[s] < nums[e];
        if(isAsc)
        while(s <= e) {
            int m = (s + e) / 2;
            if(nums[m] == target) {
                System.out.print("Target element " + target + " found at " + m);
                return;
            }

            if(isAsc) {
                if(target < nums[m]) {
                e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if(target < nums[m]) {
                s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        System.out.print("Target element " + target + " not found");
    }
}