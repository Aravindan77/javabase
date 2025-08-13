package sample;



import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String num = sc.nextLine();

        boolean isPalindrome = true;
        int len = num.length();

        for (int i = 0; i < len / 2; i++) {
            if (num.charAt(i) != num.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        sc.close();
    }
}

