public class MinWindowSubstr {

    public String minWindow(String s, String t) {

        int[] need = new int[128];
        int[] have = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int low = 0, high = 0;
        int resLen = Integer.MAX_VALUE;

         int start = 0;

        while (high < s.length()) {

            // expand window
            have[s.charAt(high)]++;

            // shrink only when window is valid
            while (isWindowValid(have, need)) {

                int len = high - low + 1;
                if (len < resLen) {
                    resLen = len;
                    start = low;
                }

                have[s.charAt(low)]--;
                low++;
            }

            high++;
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(start, start + resLen);
    }

    private boolean isWindowValid(int[] have, int[] need) {
        for (int i = 0; i < 128; i++) {
            if (have[i] < need[i]) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        MinWindowSubstr solver = new MinWindowSubstr();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solver.minWindow(s, t);
        System.out.println("Minimum window substring: " + result); // Output: "BANC"
    }
}




































