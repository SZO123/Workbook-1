public class IfStatements {
    public static void main(String[] args) {
        // Exercise 1: Is it positive?
        int number = 7;
        // TODO: print "Positive number" if number > 0, otherwise "Not positive"
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // Exercise 2: Even or odd
        int x = 10;
        // TODO: print "Even" if x is divisible by 2, otherwise "Odd"

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Exercise 3: Temperature check
        int temperature = 30; // celcius
        // TODO: print "Hot" if temperature > 25, otherwise "Not hot"

        if (temperature > 25) {
            System.out.println("Hot");
        } else {
            System.out.println("Not hot");
        }
        // Exercise 5: Can vote?
        int age2 = 17;
        // TODO: print "Can vote" if age2 >= 18, otherwise "Too young to vote"
        if (age2 >= 19) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Too young to vote");
        }
        // Exercise 4: Teenager check
        int age = 15;
        // TODO: print "Teenager" if age is between 13 and 19, otherwise "Not a teenager"
        if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not a teenager");
        }
        // Exercise 6: Multiple of both
        int y = 30;
        // TODO: print "Divisible by 3 and 5" if divisible by both, otherwise "Not divisible by 3 and 5"

        if (y % 3 == 0 && y % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }

        // Exercise 7: Outside safe range
        int speed = 120;
        // TODO: print "Unsafe speed" if speed < 30 or speed > 100, otherwise "Safe speed"
        if (speed < 30 || speed > 100) {
            System.out.println("Unsafe speed");
        } else {
            System.out.println("Safe speed");
        }
    }
}
