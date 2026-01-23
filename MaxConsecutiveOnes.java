public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max_count = 0 ;
       int max_length = 0;

       for(int i = 0 ; i < nums.length - 1 ; i++){
          if ( nums[i] == 1){
              max_count++;
              if( max_count > max_length){ 
                   max_length = max_count;
                }
            }
            else {
                max_count = 0;
            }
        }
       return max_length;
    }
    public static void main(String[] args) {
        int arr[] = { 0 , 0 , 0 ,9};
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int result = obj.findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
