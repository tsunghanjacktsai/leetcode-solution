package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxConsecutiveInBinary {
    public static LinkedList toBinary(int n) {
        int remainder;
        LinkedList<Integer> list = new LinkedList<>();
        while (n > 0) {
            remainder = n % 2;
            n /= 2;
            list.addFirst(remainder);
        }
        return list;
    }

    public static int consecutive(LinkedList<Integer> list) {
        int length = 1;
        int node;
        int max = 0;
        while (list.peek() != null) {
            node = list.poll();
            if (list.peek() == null) {
                break;
            }
            if (node == list.peek()) {
                length++;
                if (max < length) {
                    max = length;
                }
            } else {
                length = 1;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<Integer> list = toBinary(n);
        int length = consecutive(list);
        System.out.println(length);

        scanner.close();
    }
}
