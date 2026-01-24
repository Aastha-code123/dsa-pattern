public class SortArrayByParity {
public int[] sortArrayByParity(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while(low<high){
        if(nums[low]%2==0){
            low++;
        }
        else if (nums[high]%2==1){
            high--;
        }
        else{
            // swap nums[low] and nums[high]
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
    }
}
    return nums;
}
public static void main(String[] args) {
    SortArrayByParity obj = new SortArrayByParity();
    int[] arr = {3,1,2,4};
    int[] sortedArr = obj.sortArrayByParity(arr);
    for(int num : sortedArr){
        System.out.print(num + " ");
    }
    // Possible Output: 2 4 3 1 (even numbers first, order within even and odd can vary)
}
}
