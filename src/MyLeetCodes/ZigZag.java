package MyLeetCodes;

public class ZigZag {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];

        int counter = 0;
        int bottom = rows.length - 1;
        boolean direction  = true;
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(counter < 0) counter = 0;
            if(rows[counter] == null) rows[counter] = "";
            rows[counter] += s.charAt(i);
            if(counter == bottom){
                direction = false;
            }
            else if(counter == 0){
                direction = true;
            }
            counter = direction == true ? counter + 1 : counter - 1;
        }
//        for(String sd: rows) result += sd;
        return rows.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING", 3));
    }
}
