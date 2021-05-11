package MyLeetCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] numbers, int target){
        int x = numbers.length;
        int counter = 0;
        ArrayList<Integer> num = new ArrayList<>();

        for(int i=0; i<x; i++){
            for(int k=0; k<x; k++){
                if((numbers[i] + numbers[k] == target) && (i!=k)){
                    return new int[]{i, k};
                }
            }
        }
        throw new IllegalArgumentException("No solution founnd");
    }






    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        for(int x : new twoSum().twoSum(new int[]{2,7,11,15}, 9)){
            System.out.print(x);
        }
    }
}
