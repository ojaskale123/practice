import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        // even odd number identifier
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int p = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("it is a even num");
        } else {
            System.out.println("it is a odd num");
        }
    }
}
