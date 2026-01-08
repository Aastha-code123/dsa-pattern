public class RemoveDuplicateII {
    public int solution ( int[]  arr){
        int officer = 1;
        int k = 2 ;
        int cm = 2;
        int n = arr.length;
        while( cm < n ){
            if (arr[cm] == arr[officer -1]){
                cm++;
                continue;
            }
            else {
                arr[officer+1] = arr[cm];
                officer++;
                k++;
                cm++;
        
            }
        }
        return k;
    }
    public static void main ( String[] args ){
        int[] arr = {2,2,2,2,3,3};
        RemoveDuplicateII rd = new RemoveDuplicateII();
        int result = rd.solution(arr);
        System.out.print(result);
    }
}