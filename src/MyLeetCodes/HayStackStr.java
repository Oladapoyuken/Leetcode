package MyLeetCodes;

public class HayStackStr {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

    }

    public static void main(String[] args) {
        System.out.println(new HayStackStr().strStr("", "j"));;
    }
}
