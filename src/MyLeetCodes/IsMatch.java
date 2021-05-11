package MyLeetCodes;


//Not solved

public class IsMatch {
    public boolean isMatch(String s, String p) {
        int k = 0, i = 0;
        boolean result = true;
        char hold = p.charAt(0);
        while(i < s.length() && k < p.length()){                    //a a           //a
            if(p.charAt(k) == '.' || p.charAt(k) == s.charAt(i)){
                hold = p.charAt(k);
                k++; i++;

                if((k >= p.length()-1 && i < s.length()-1)
                        || i >= s.length()-1 && k < p.length()-1)
                    result = false;
            }
            else if(p.charAt(k) == '*'){
                for(int n = i; n < s.length(); n++){
                    if((hold == s.charAt(n) || hold == '.') && hold != '*'){
                       i++;

                    }
                    else{
                        hold = p.charAt(k);
                        k++;
                        break;
                    }
                }
                if((k >= p.length()-1 && i < s.length()-1)
                        || i >= s.length()-1 && k < p.length()-1)
                    result = false;
            }
            else if(k+1 < p.length() && p.charAt(k+1) == '*'){
                k++;
                hold = p.charAt(k);

                if((k >= p.length()-1 && i < s.length()-1)
                        || i >= s.length()-1 && k < p.length()-1)
                    result = false;

            }
            else {
                result = false;
                break;
            }
        }
//        if(k < p.length()-1 || i < s.length()-1){
//            result = false;
//        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new IsMatch().isMatch("aa", "a"));
    }
}
