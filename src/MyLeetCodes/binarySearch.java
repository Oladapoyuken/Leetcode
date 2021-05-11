package MyLeetCodes;

public class binarySearch {
    public int solution(int[] val, int target){
        int[] x = {1, 3, 4, 7, 10, 14, 15, 20};
        int min = 0;
        int max = x.length - 1;
        while(min <= max){
            int mid = (max + min) / 2;
            int guess = x[mid];
            if(guess == target){
                return guess;
            }
            if(guess > target){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return -1;
    }
}
