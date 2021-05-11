package MyLeetCodes;
public class intToRoman {
    public String intToRoman(int num) {
        String romans[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int nums[] =      { 1,   4,  5,  9,  10,  40,  50, 90, 100, 400, 500,900,1000};
        int i = nums.length - 1;
        String result = "";
        while(num > 0){
            if((num / nums[i]) >= 1){
                result += romans[i];
                num -= nums[i];
            }
            else{
                i--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new intToRoman().intToRoman(1994));


    }
}
