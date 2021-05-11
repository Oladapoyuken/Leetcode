package MyLeetCodes;

public class MaxArea {
    public int maxArea(int[] height) {
        int i = 0, k = height.length - 1, max = 0;
        while (i < k){
            if(height[i] >= height[k]){
                max = Math.max(height[k] * (k - i), max);
                k--;
            }
            else{
                max = Math.max(height[i] * (k - i), max);
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MaxArea().maxArea(new int[]{0,2}));
    }
}
