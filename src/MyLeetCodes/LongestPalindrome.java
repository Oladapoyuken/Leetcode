package MyLeetCodes;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String LP = "";
        char sep[] = s.toCharArray();
        int step = 0;
        for (char x : sep) {
            if(s.length()-step < LP.length()) break;

            for(int i = step; i < sep.length; i++){
                if(x == sep[i]){
                   String sub = s.substring(step, i+1);
                   Boolean isPalindrome = true;
                   int m = 0, n = sub.length()-1;
                   while(m < n){
                       if(sub.charAt(m) != sub.charAt(n)){
                           isPalindrome = false;
                           break;
                       }
                       m++; n--;
                   }
                   if(isPalindrome && LP.length() < sub.length()){
                        LP = sub;
                   }
                }
            }
            step++;
        }
        return LP;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("cabacgste"));
    }
}
