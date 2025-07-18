import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        // converting rupees in dollars.
        Scanner input = new Scanner(System.in);
        System.out.println("rupees = ");
        int num = input.nextInt();
        int result = (num * 80);
        System.out.println("in dollars = " + result);
    }
}
