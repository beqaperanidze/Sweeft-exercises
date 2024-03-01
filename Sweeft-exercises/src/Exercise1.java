
public class Exercise1 {
    /**
     * In this method the input String is being split into String array (by - and + symbols).
     * Then the list is iterated through and we find the result.
     * @param expression String of expression given.
     * @return The result of the expression.
     */
    public static int evaluateExpression(String expression){
        String[] numbersAndOperators = expression.split("(?=[+-])");
        int result = Integer.parseInt(numbersAndOperators[0]);
        for (int i = 1; i < numbersAndOperators.length; i++) {
            String operator = numbersAndOperators[i].substring(0, 1);
            int number = 0;
            try {
                number = Integer.parseInt(numbersAndOperators[i].substring(1));
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
                System.exit(1);
            }
            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }
        return result;
    }
}
