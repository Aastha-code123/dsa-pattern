class RemoveDuplicate{
    public int solution ( int[]  arr){
        int officer = 0;
        int k = 1 ;
        int cm =  1;
        int n = arr.length;
        while( cm < n ){
            if (arr[cm] == arr[cm-1]){
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
        int[] arr = { 1,1,1,2,2,3,3,4,7,9,9,9};
        RemoveDuplicate rd = new RemoveDuplicate();
        int result = rd.solution(arr);
        System.out.print(result);
    }
}