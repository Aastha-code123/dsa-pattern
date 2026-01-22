public class ValidPalindrome2 {
     public boolean validPalindrome(String s) {
        int left = 0 ;
        int right = s.length() - 1;

         while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                
                int l1 = left+1; // skipping left 
                int r1 = right;
                boolean skipleft = true;

                while( l1 < r1){          // now check palindrome
                    if(s.charAt(l1) != s.charAt(r1)){
                        skipleft = false;
                        break;
                    }
                
                     l1++;
                     r1--;
                }

                
                int l2 = left;    // skipping right
                int r2 = right-1;
                boolean skipright = true;

                while( l2 < r2){           // now check palindrome
                    if(s.charAt(l2) != s.charAt(r2)){
                    skipright = false;
                        break;
                    }
                
                     l2++;
                     r2--;
                }
        
                 return skipleft || skipright;
            }                   // when left & right both are equal
            left++;
            right--;
        }
      return true;  
    }
    public static void main(String[] args) {
        ValidPalindrome2 vp = new ValidPalindrome2();
        String s = "abca";
        boolean result = vp.validPalindrome(s);
        if(result){
            System.out.println("palindrome");
        }
        else{
        System.out.println("not palindrome");
        }
    }
}