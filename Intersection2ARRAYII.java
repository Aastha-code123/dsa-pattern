public class Intersection2ARRAYII {
     public int[] intersect(int[] nums1, int[] nums2) {

        int[] freq = new int[1001];
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0 ;

        for(int num : nums1){
            freq[num]++;
        }
        for(int num : nums2){
           if ( freq[num] > 0){
                result[i] = num;
                i++;

               freq[num]--;
           }

            
        }
        int[] finalResult = new int[i];
        for (int j = 0; j < i; j++) {
            finalResult[j] = result[j];
     }   
      return finalResult;
}
    public static void main(String[] args) {
        Intersection2ARRAYII obj = new Intersection2ARRAYII();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = obj.intersect(nums1, nums2);
        System.out.print("Intersection of the two arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
