import java.util.*;

public class ThreeSumCloset {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;

        // initialize closest sum with first 3 elements
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // update closest sum
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // exact match found
                    return sum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, 1, -4};
        int target = 1;

        ThreeSumCloset tsc = new ThreeSumCloset();
        System.out.println(tsc.threeSumClosest(arr, target));
    }
}
