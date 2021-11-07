package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCsv {
    public static void main(String[] args) {
        System.out.println(new StringCsv().solution("a,b,c\nade,4,M\nBolu,6,F"));
    }

    public String solution(String S) {
        String[] result = S.split("\\s*\n\\s*");
        List<String> allGood = new ArrayList<>();
        for (String row : result) {
            List<String> cells = Arrays.asList(row.split("\\s*,\\s*"));
            if (!cells.contains("NULL"))
                allGood.add(String.join(",", cells));
        }

        return String.join("\n", allGood);
    }
}
