public class IndexFirstOccuranceString {
     public int strStr(String haystack, String needle) {

        if(needle.length() == 0){
            return 0 ;
        }
        for ( int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            boolean match = true;
        
          for (int j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match == true){
            return i ;
            }
     }
     return -1;
    }
    public static void main(String[] args) {
        IndexFirstOccuranceString solver = new IndexFirstOccuranceString();
        String haystack = "a";
        String needle = "a";
        int result = solver.strStr(haystack, needle);
        System.out.println("First occurrence index: " + result); // Output: 2
    }
}
