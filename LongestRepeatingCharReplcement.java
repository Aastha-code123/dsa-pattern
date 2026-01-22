public class LongestRepeatingCharReplcement {
     public int characterReplacement(String s, int k) {
        
        int [] freq = new int[256];
        int low = 0;
       int high = 0 ;
       int maxfreq = 0 ;
       int maxLength = 0 ;

       for ( high = 0 ; high < s.length() ; high++ ) {
        char ch = s.charAt(high);
        freq[ch]++;
        maxfreq = Math.max(maxfreq , freq[ch]);

        int len = high - low + 1 ;
        int diff = len - maxfreq;

        while(diff > k ){
            char leftChar = s.charAt(low);
            freq[leftChar]--;
            low++;

            len = high - low + 1 ;
            diff = len - maxfreq;
        }
        
            maxLength = Math.max(maxLength , len);
    }
    
    return maxLength;
    }
    public static void main(String[] args) {
        LongestRepeatingCharReplcement obj = new LongestRepeatingCharReplcement();
        String s = "AABABBA";
        int k = 1;
        int result = obj.characterReplacement(s, k);
        System.out.println("Longest repeating character replacement length: " + result);
    }
}
