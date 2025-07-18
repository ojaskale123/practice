import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        // finding gretter number.
        Scanner input = new Scanner(System.in);
        System.out.println("give number 1");
        int num1 = input.nextInt();
        System.out.println("give number 2");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("gretter number is = " + num1);
        } else {
            System.out.println("gretter number is = " + num2);
        }
    }
}