public class MinSizeSubarray {
     public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        while(high < n){
            sum = sum + nums[high];

            while(sum>= target){
                int len = high - low + 1;
                result = Math.min(result,len);
                sum = sum - nums[low];
                low++;
            }
            high ++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,1};
        int target = 11;
        MinSizeSubarray mss = new MinSizeSubarray();
        int result = mss.minSubArrayLen(target, arr);
        System.out.println("Minimum size of subarray with sum at least " + target + " is: " + result);
    }
}
