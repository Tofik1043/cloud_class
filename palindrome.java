import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Convert input to lowercase to handle case-insensitivity
        String str = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
