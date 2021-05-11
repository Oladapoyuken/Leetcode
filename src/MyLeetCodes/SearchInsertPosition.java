package MyLeetCodes;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int result = 1;
        if(nums.length == 1){
            if(target <= nums[0]){
                result = 0;
            }
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] >= target){
                    result = i;
                    break;
                }
                else {
                    result = i+1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3}, 4));
    }
}
