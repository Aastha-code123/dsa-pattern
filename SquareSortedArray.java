import java.util.Arrays;

import java.util.ArrayList;

public class SquareSortedArray {
    public int[] solution(int num[]){

        ArrayList <Integer> neg = new ArrayList<>();
        ArrayList <Integer> pos = new ArrayList<>();

    // separate array elements in two different neg and positive array

         for(int a : num){
            if(a < 0){
                neg.add(a);
            }
            else {
                pos.add(a);
            }
         }

    // if array has only positve elements 
    
        if(neg.size() == 0){
            int res[] = new int[pos.size()];

            for(int i = 0 ; i< pos.size() ; i++){
                 res[i] = pos.get(i) * pos.get(i);
            }
            return res;
        }

    // if array has only negative elements
    
         if(pos.size() == 0){
            int res[] = new int[neg.size()];
            int index = 0;

            for( int i = neg.size()  ; i > 0 ; i-- ){
                res[index++] = neg.get(i) * neg.get(i);
            }
            return res;
         }

    // if array have both negative and positive elements
         int n1 = neg.size();
         int n2 = pos.size();
         int res[] = new int[n1+n2];

         int i = n1 - 1;
         int j = 0;
         int index = 0;

         // like merge two sorted array 
         while(i >= 0 && j < n2){

            int negSq = neg.get(i) * neg.get(i);
            int posSq = pos.get(j) * pos.get(j);

            if(negSq <= posSq){
                res[index] = negSq;
                index++ ;
                i--;
                
            }
            else{
                res[index] = posSq;
                index++ ;
                j++;
            }
         }

         // remaining negative square 
         while(i>=0){
            res[index] = neg.get(i) *  neg.get(i);
             index++;
             i--;
         }
         while(j<n2){
            res[index] = pos.get(j) *  pos.get(j);
             index++;
             j++;
         }
         return res;
    }
    public static void main(String[] args) {

        int[] num = {-4 , -1 , 0 , 3, 10};

        SquareSortedArray ssa = new SquareSortedArray();

        int[] result = ssa.solution(num);
        System.out.println(Arrays.toString(result));
    }
}
