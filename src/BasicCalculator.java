import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the 1st number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Which operation do you want to use: add, subtract, multiply, or divide?");
        System.out.print("Please select an option: ");
        String operation = scanner.next();

        double total = firstNumber * secondNumber;

        System.out.printf("%f * %f = %f", firstNumber, secondNumber, total);



    }
}
