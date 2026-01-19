public class LongestKSubstring {

    public int longestKSubstr(String s, int k) {

        int[] freq = new int[26];
        int unique = 0;

        int left = 0; int right = 0;
        int maxLen = -1;

        for (right = 0; right < s.length(); right++) {

            int r = s.charAt(right) - 'a';

            if (freq[r] == 0) {
                unique++;
            }
            freq[r]++;

            while (unique > k) {

                int l = s.charAt(left) - 'a';
                freq[l]--;

                if (freq[l] == 0) {
                    unique--;
                }
                left++;
            }

            if (unique == k) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        LongestKSubstring obj = new LongestKSubstring();
        String s = "aabbcc";
        int k = 2;
        int result = obj.longestKSubstr(s, k);
        System.out.println("Length of the longest substring with exactly " + k + " unique characters: " + result);
    }
}   