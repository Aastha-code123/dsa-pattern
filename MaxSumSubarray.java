public class MaxSumSubarray {
      public int maxSubarraySum(int[] arr, int k) {
    
        int low = 0 ;
        int high = k-1;
         int sum = 0 ;

         for( int i = 0 ; i<= high ; i++){
            sum += arr[i];
        }
        int res = sum ;

         while(high < arr.length ){

            res = Math.max(res, sum);

            low ++;
            high++;

            if(high == arr.length) break;

            sum = sum - arr[low -1];
            sum = sum + arr[high];

         }

         return res;
    }
    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 1;
        MaxSumSubarray mss = new MaxSumSubarray();
        int result = mss.maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
