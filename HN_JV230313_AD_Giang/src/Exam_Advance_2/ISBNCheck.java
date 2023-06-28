package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class ISBNCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số ISBN (gồm 10 chữ số): ");
        String isbn = scanner.nextLine();

        if (isbn.length() != 10) {
            System.out.println("Số ISBN không hợp lệ (10 chữ số)");
        } else {
            boolean isValid = checkISBN(isbn);
            if (isValid) {
                System.out.println("Số ISBN hợp lệ.");
            } else {
                System.out.println("Số ISBN không hợp lệ.");
            }
        }
    }

    public static boolean checkISBN(String isbn) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {

            int digit = isbn.charAt(i); ;
            stack.push(digit);
            sum += (i + 1) * digit;
        }

        return sum % 11 == 0;
    }
}
