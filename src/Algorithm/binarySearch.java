package Algorithm;

public class binarySearch {
    public static int solution(int[] val, int target) {
        int min = 0;
        int max = val.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            int guess = val[mid];
            if (guess == target) {
                return mid;
            }
            if (guess > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static int getTargetIndex(int[] array, int target) {
        int max = array.length - 1;
        int min = 0;

        while (min < max) {

            int mid = min + (max - min) / 2;

            if (array[mid] > target)
                max = mid - 1;

            if (array[mid] < target)
                min = mid + 1;

            if (array[mid] == target)
                return mid;
        }
        throw new IllegalArgumentException(target + " Not found");
    }

    public static int findDuplicateInteger(int[] array) {
        int max = array.length - 1;
        int min = 0;
        if (min >= max)
            throw new IllegalArgumentException("No duplicate item found");

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (array[mid] == mid + 1) {
                if (mid < array.length - 2)
                    if (array[mid] == array[mid + 1])
                        return array[mid];
                min = mid + 1;
            } else {
                if (array[mid] == array[mid - 1])
                    return array[mid];

                max = mid - 1;
            }
        }
        throw new IllegalArgumentException("No duplicate item found");
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0};
        int duplicate = findDuplicateInteger(array);

        System.out.println(duplicate);
    }

}
