import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args, Object price) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like?");
        System.out.println("1: Regular: $5.45");
        System.out.println("2: Large: $8.95");
        System.out.print("1 or 2: ");
        int size = scanner.nextInt();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 17) {
            price = price * 0.9;

            double price = 0;
            if (size == 1) {
                price = 5.45;
            } else if (size == 2) {
                price = 8.95;
            }


        }
    }

}
