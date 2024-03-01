import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise2 {
    /**
     * In this method we iterate through the list and check each string whether it contains consecutive identical characters.
     * @param strings List of strings.
     * @return Number of strings that are happy.
     */
    public static int numberOfHappyStrings(List<String> strings) {
        AtomicInteger counter = new AtomicInteger();
        strings.forEach(string -> {
            boolean isHappy = true;
            for (int i = 0; i < string.length() - 1; i++) {
                if (string.charAt(i) == string.charAt(i + 1)) {
                    isHappy = false;
                    break;
                }
            }
            if (isHappy) {
                counter.getAndIncrement();
            }
        });
        return counter.get();
    }
}
