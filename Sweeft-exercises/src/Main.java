import helper.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Beqa Peranidze
 */
public class Main {
    public static void main(String[] args) {
        //Exercise 1:
        {
            String exp = "5+20-8-10";
            System.out.println(Exercise1.evaluateExpression(exp));
            System.out.println("-----------------------------------------------------------------------------------:");
        }

        //Exercise 2:
        {
            List<String> strings = new ArrayList<>();
            strings.add("abbcc");
            strings.add("abc");
            strings.add("abcabc");
            strings.add("cabcbb");
            System.out.println(Exercise2.numberOfHappyStrings(strings));
            System.out.println("-----------------------------------------------------------------------------------:");
        }

        //Exercise 3:
        {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            ListNode reversedHead = Exercise3.reverseList(head);
            System.out.println(reversedHead);
            System.out.println("-----------------------------------------------------------------------------------:");
        }

        //Exercise 4:
        {
            int[] array1 = new int[]{1, 2, 3, 3, 4, 5};
            int[] array2 = new int[]{3, 4, 4, 5, 6, 7};
            System.out.println(Arrays.toString(Exercise4.findIntersection(array1, array2)));
            System.out.println("-----------------------------------------------------------------------------------:");
        }

        //Exercise 5:
        {
            int[] array = {6, 2, 2, 3, 4, 1};
            int k = 8;
            int result = Exercise5.lenOfLongSubarr(array, k);
            System.out.println("Result: " + result);
            System.out.println("-----------------------------------------------------------------------------------:");
        }

        //Exercise 6:
        {
            int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
            int[] sequence = {1, 6, -1, 10};
            System.out.println(Exercise6.isValidSequence(array, sequence));
            System.out.println("-----------------------------------------------------------------------------------:");
        }
    }
}
