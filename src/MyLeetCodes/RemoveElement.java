package MyLeetCodes;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length-1 ;
        int result = 0;
        while(i <= j){
            if(nums[i] == val){
                while(j != i){
                    if(nums[j] == val){
                        j--;
                    }
                    else{
                        nums[i] = nums[j];
                        result++;
                        j--;
                        break;
                    }
                }
            }
            else {
                result++;
            }
            i++;
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(new RemoveElement().removeElement(new int[]{0,0,0,2,2,2,2,1}, 2));
    }
}
