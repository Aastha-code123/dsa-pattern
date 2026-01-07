
import java.util.Arrays;

public class TwoSumII {
    public int[] solution( int[] arr , int key){
 
        int start = 0;
        int end = arr.length -1;

    while (start < end){
        int sum = arr[start] + arr[end] ;
    if ( sum == key ){
        return new int[] {start , end};
    }
    else if (sum<key){
        start++;
    }
    else {end-- ;
    }
}
    return new int[] {} ;
    }
public static void main(String[] args) {
    int[] arr = {2,11,15,7};
    int key = 9;

    TwoSumII ts = new TwoSumII();
    int[]  result = ts.solution(arr, key);
    System.out.print(Arrays.toString(result));
}}
    
