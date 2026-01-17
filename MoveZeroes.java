public class MoveZeroes {
    public void moveZeroes(int[] nums) {
         int low = 0 ;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=0){
                nums[low] = nums[i];
                low++;
            }

        }
        while (low < nums.length) {
            nums[low] = 0;
            low++;
        }   
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes obj = new MoveZeroes();
        obj.moveZeroes(nums);
        System.out.println("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
