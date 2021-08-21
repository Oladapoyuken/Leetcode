package MyLeetCodes;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        System.out.println(new threeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList();
        List<Integer> numss = new ArrayList<>();
        for (int x : nums) {
            numss.add(x);
        }
        numss.sort(Comparator.reverseOrder());

        Map<Integer, List<Integer>> map = new HashMap();
        int i = 0, j = 1, k = 2;

        int n = 0;
        if (nums.length < 3) return list;
        while (numss.get(i) >= 0) {
            List<Integer> list1 = new ArrayList<>();
            if (k < nums.length) {
                int a = numss.get(i);
                int b = numss.get(j);
                int c = numss.get(k);
                if ((a + b) >= 0 && c <= 0) {
                    if ((a + b + c) == 0) {
                        list1.add(a);
                        list1.add(b);
                        list1.add(c);
                        if (!map.containsValue(list1)) {
                            list.add(list1);
                            map.put(n, list1);
                            n++;
                        }
                    }
                }
            }
            if (k < nums.length) {
                k++;
            } else if (j < nums.length - 1) {
                j++;
                k = j + 1;
            } else if (i < nums.length - 2) {
                i++;
                j = i + 1;
                k = j + 1;
            } else {
                break;
            }
        }
        return list;
    }
}
