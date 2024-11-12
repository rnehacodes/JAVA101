import java.util.*;

public class Boundaries {
    public static void main(String[] args) {
        int[] nums = Randoms.generateAscSortedRandomArray(8, 0, 10);
        int target = 5, lb = getLowerBound(nums, target), ub = getUpperBound(nums, target);

        System.out.println("Lower Bound");
        System.out.print("Array: " + Arrays.toString(nums) + "\n Lower bound of " + target + " found at index: " + lb + " i.e. " + nums[lb]);

        System.out.println("\nUpper Bound");
        System.out.print("Array: " + Arrays.toString(nums) + "\n Upper bound of " + target + " found at index: " + ub + " i.e. " + nums[lb]);

    }

    //Lowerbound -> smallest m such that arr[m] >= target
    //Finding lowerbound (Assuming ascending order sorted array)
    static int getLowerBound(int[] nums, int target) {
        int s = 0, e = nums.length - 1, lb = e;
        while(s <= e) {
            int m = (s + e) / 2;
            if(target < nums[m]) {
                e = m - 1;
            } else if(target >= nums[m]) {
                s = m + 1;
            } else {
                lb = Math.min(lb, m);
            }
        }
        return lb;
    }

    //Upperbound -> smallest m such that arr[m] > target
    //Finding upperbound (Assuming ascending order sorted array)
    static int getUpperBound(int[] nums, int target) {
        int s = 0, e = nums.length - 1, ub = e;
        while(s <= e) {
            int m = (s + e) / 2;
            if(target < nums[m]) {
                e = m - 1;
                ub = Math.min(ub, m);
            } else {
                s = m + 1;
            }
        }
        return ub;
    }
}