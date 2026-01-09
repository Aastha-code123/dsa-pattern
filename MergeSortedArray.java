public class MergeSortedArray {
    public static  void solution(int num1[] , int m , int num2[] , int n ){
        int i = m-1;
        int j = n-1;
        int k= m+n-1;

        while(i>=0 && j>=0){
            if( num1[i] <= num2[j]){
                num1[k] = num2[j];
                j--;
            }
            else if( num1[i] >= num2[j]){
                num1[k] = num1[i];
                i--;
            }
                k--;
         }
         while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
     public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution(nums1, m, nums2, n);

        // print result
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
