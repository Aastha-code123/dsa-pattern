import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] solution( int[] arr , int key){

    HashMap<Integer , Integer> hm = new HashMap<>();

    for ( int i = 0 ; i < arr.length ; i++){

    int need = key - arr[i] ;

    if (hm.containsKey(need)){
        int FirstIndex = hm.get(need);
        int SecondIndex = i;
        return  new int[] {FirstIndex,SecondIndex};
    }
    hm.put(arr[i] , i);
    }
    return new int[] {} ;
    }
public static void main(String[] args) {
    int[] arr = {2,11,15,7};
    int key = 9;

    TwoSum ts = new TwoSum();
    int[]  result = ts.solution(arr, key);
    System.out.print(Arrays.toString(result));
}
    
}