package Algorithm;

public class binarySearch {

    public static int findDuplicateInteger(int[] numbers) {
        if (numbers.length > 2) {
            int min = 0;
            int max = numbers.length - 1;

            while (min <= max) {
                int mid = (max + min) / 2;
                if (numbers[mid] == mid + 1) {
                    if ((mid + 1) < numbers.length)
                        if (numbers[mid + 1] == mid + 1)
                            return mid + 1;
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        throw new IllegalArgumentException("No duplicate number found");
    }

    public static int find(int[] arr, int target) {

        int maxIndex = arr.length - 1;
        int minIndex = 0;

        while (minIndex <= maxIndex) {
            int midIndex = (maxIndex + minIndex) / 2;
            if (arr[midIndex] == target)
                return midIndex;
            if (arr[midIndex] < target) {
                minIndex = midIndex + 1;
            }
            if (arr[midIndex] > target) {
                maxIndex = midIndex - 1;
            }
        }

        throw new IllegalArgumentException("Cannot find target");
    }

    public static int testBinarySearch(int[] array, int target) {

        int min = 0;
        int max = array.length - 1;


        while (min <= max) {
            int mid = (max + min) / 2;

            if (array[mid] == target)
                return mid;

            if (array[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        throw new IllegalArgumentException("Target not found!");
    }


    public static void main(String[] args) {

//        System.out.println(find(new int[] {1,2,3,4,5,6,7,7}, 9));
        System.out.println(testBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 7}, 8));
    }

}
