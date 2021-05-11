package MyLeetCodes;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int k = 0;
        String substr = "";
        int len = 0;
        while(k < s.length()){
            for(int i = k; i < s.length(); i++){
                if(substr.contains(String.valueOf(s.charAt(i)))){
                    len = Math.max(len, substr.length());
                    System.out.println(substr);
                    substr = "";
                    break;
                }
                else{
                    substr += s.charAt(i);
                }
            }
            k++;
        }
        return Math.max(len, substr.length());
    }
    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("dvdf"));
    }
}
