public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int high = 0; high < nums.length; high++) {

            if (nums[high] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes3 obj = new MaxConsecutiveOnes3();
        int[] arr = {0,0,0,0};
        int k = 2;
        System.out.println(obj.longestOnes(arr, k)); // Output: 2
    }
}
