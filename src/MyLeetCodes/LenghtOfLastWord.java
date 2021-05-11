package MyLeetCodes;

public class LenghtOfLastWord {
    public int lengthOfLastWord(String s) {
        int max = 0;
        int size = s.length()-1;
        for(int i = size; i >= 0; i--){
            if(s.charAt(i) != ' '){
                for(int k = i; k >= 0; k--){
                    if(s.charAt(k) == ' ') break;
                    max++;
                }
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LenghtOfLastWord().lengthOfLastWord("nbnnm"));
    }
}
