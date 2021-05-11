package MyLeetCodes;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        if(nums.length == 1) return max;

        for(int i = 0; i < nums.length; i++){

        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }















    public int maxSubArray2(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int start, int end) {
        if (start == end) return nums[start]; // Base case

        int mid = start + (end - start) / 2;

        int leftSum = helper(nums, start, mid); // Indices are inclusive
        int rightSum = helper(nums, mid + 1, end);
        int crossSum = crossSum(nums, start, mid, end);

        return
                Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    private int crossSum(int[] nums, int start, int mid, int end) {

        int sum = 0;
        int leftMax = Integer.MIN_VALUE;

        for (int i = mid; i >= start; i--) { // Calculate max sum from mid to start
            sum += nums[i];
            leftMax = Math.max(leftMax, sum);
        }

        sum = 0;
        int rightMax = Integer.MIN_VALUE;

        for (int i = mid + 1; i <= end; i++) { // Calculate max sum from mid + 1 to end
            sum += nums[i];
            rightMax = Math.max(rightMax, sum);
        }
        return leftMax + rightMax; // Cross sum
    }
}
