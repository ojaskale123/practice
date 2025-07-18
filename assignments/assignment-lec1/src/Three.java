import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        // simple intrest exampleeeeee.......
        Scanner input = new Scanner(System.in);
        System.out.println("give me principal value");
        float p = input.nextFloat();
        System.out.println("give me time in years");
        int t = input.nextInt();
        System.out.println("give me rate");
        int r = input.nextInt();

        float result = (p * t * r / 100);
        System.out.println("your total amount is =" + result);
    }
}