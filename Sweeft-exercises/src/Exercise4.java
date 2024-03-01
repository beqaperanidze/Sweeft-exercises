import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    /**
     * In this method given arrays are converted into sorted and distinct lists by stream.
     * then the values of these lists are compared, matching elements are written into the result array.
     *
     * @param nums1 First array.
     * @param nums2 Second array.
     * @return Array of intersections of 2 given arrays.
     */
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        List<Long> list1;
        List<Long> list2;

        list1 = Arrays.stream(nums1).asLongStream().distinct().sorted().boxed().toList();
        list2 = Arrays.stream(nums2).asLongStream().distinct().sorted().boxed().toList();

        List<Long> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            long num1 = list1.get(i);
            long num2 = list2.get(j);

            if (num1 == num2) {
                intersection.add(num1);
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k).intValue();
        }
        return result;
    }
}

