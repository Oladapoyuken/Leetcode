package CodeWithMosh;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

    public char firstRepeat(String string) {
        Set<Character> set = new HashSet<>();
        for (var c : string.toCharArray()) {
            if (c != ' ') {
                if (set.contains(c))
                    return c;
                set.add(c);
            }
        }
        return Character.MIN_VALUE;
    }
}
