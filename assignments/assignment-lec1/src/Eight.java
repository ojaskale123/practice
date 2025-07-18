import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        // this cod is fully copied so try thisvarious time.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or string: ");
        String text = input.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(text).reverse().toString();

        // Compare original and reversed (ignore case)
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
    }
}
