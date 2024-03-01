public class Exercise6 {
    /**
     * In this method we iterate through the array and the sequence, only incrementing sequence index when the element matches with array element.
     * It returns true once sequence has been successfully iterated through, otherwise it returns false.
     *
     * @param array    given array.
     * @param sequence possible subarray.
     * @return Whether the sequence is a subarray of array
     */
    public static boolean isValidSequence(int[] array, int[] sequence) {
        int sequenceIndex = 0;
        for (int j : array) {
            if (sequence[sequenceIndex] == j)
                sequenceIndex++;
            if (sequenceIndex == sequence.length)
                return true;
        }
        return false;
    }
}
