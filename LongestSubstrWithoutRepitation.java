public class LongestSubstrWithoutRepitation {
     public int lengthOfLongestSubstring(String s) {
        int n = s.length();

       int[] freq = new int[128];
        int left = 0; int right = 0;
        int maxLen = 0;

        while (right < n) {
            char rChar = s.charAt(right);
            freq[rChar]++;

            while (freq[rChar] > 1) {
                char lChar = s.charAt(left);
                freq[lChar]--;
                left++;
            }

            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
            }
            right++;
        }

        return maxLen;  
}

    public static void main(String[] args) {
        LongestSubstrWithoutRepitation obj = new LongestSubstrWithoutRepitation();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
