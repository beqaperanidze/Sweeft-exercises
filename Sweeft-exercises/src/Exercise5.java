import java.util.Arrays;

public class Exercise5 {
    /**
     * this method takes an array of integers and an integer k as input.
     * It sorts the array and then finds the maximum number of elements in the array whose sum is less than or equal to k.
     * The method returns the count of such elements.
     * @param array given array
     * @param k number, which the elements of given array should add up to.
     * @return Maximum number of elements, which adds up to input k.
     */
    public static int lenOfLongSubarr(int[] array, int k) {
        Arrays.sort(array);
        int maxCount = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < array.length; right++) {
            sum += array[right];

            while (sum > k) {
                sum -= array[left];
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}

