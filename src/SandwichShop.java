import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like?");
        System.out.println("1: Regular: $5.45");
        System.out.println("2: Large: $8.95");
        System.out.print("1 or 2: ");
        int size = scanner.nextInt();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double price = 0;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        }


        if (age <= 17) {
            price = price * 0.9;
        } else if (age >= 65) {
            price = price * 0.8;

        }

        System.out.printf("Total cost of sandwich: $%.2f\n", price);

    }
    }



