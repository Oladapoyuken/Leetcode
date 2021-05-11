package MyLeetCodes;

public class removeDuplicate {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int cnt = 0;
        if(nums.length == j) return 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[cnt] = nums[i];
                cnt++;
            }
            if(j == nums.length-1) {
                cnt++;
                nums[cnt-1] = nums[j];
            }
            i++; j++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new removeDuplicate().removeDuplicates(new int[]{1,1,2,3,3,7}));
    }
}
