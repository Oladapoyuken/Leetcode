package MyLeetCodes;

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        if(n == 1){
            return "1";
        }
        else {
            while (n > 1){
                String mainStr = "";
                char temp = result.charAt(0);
                int counter = 0;
                for(int i = 0; i < result.length(); i++){
                    if(temp == result.charAt(i)){
                        counter++;
                    }
                    else{
                        mainStr += String.valueOf(counter) + temp;
                        temp = result.charAt(i);
                        counter = 1;
                    }
                }
                mainStr += String.valueOf(counter) + temp;
                result = mainStr;
                System.out.println(result);
                n--;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        new CountAndSay().countAndSay(10);
    }
}
