import java.util.*;

public class TripletSmallerSum {
    
     public long countTriplets(int n, int sum, long arr[]) {

        Arrays.sort(arr);
        int m = arr.length;
        long ans = 0;

        for ( int i = 0 ; i < m-2 ; i++){
            int left = i+1;
            int right = m-1;

            while(left < right){

                long add   = arr[i] + arr[left] + arr[right];

                if(add >= sum){
                    right--;
                }
                else{
                    ans = ans + (right - left);
                    left++;
                    
                }       
        
            }       
        }
        return ans;
    }
    public static void main (String [] args ){
        long [] arr =  { -2 , 0, 1, 3};
        int n = 4;
        int sum = 2 ;
        TripletSmallerSum tss = new TripletSmallerSum();
        long result = tss.countTriplets(n, sum, arr);
        System.out.println(result);

    }
}
