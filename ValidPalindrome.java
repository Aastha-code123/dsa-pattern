public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = s.length();

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "mad a*m";
        ValidPalindrome obj = new ValidPalindrome();
        boolean res = obj.isPalindrome(s);
        if (res) {
            System.out.println("yes this is palindrome");
        } else {
            System.out.println(" no not a palindrome");
        }
    }
}

    


