import java.util.Scanner;

public class level3ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if (year < 1582) {
                System.out.println("The Gregorian calendar logic only applies to years 1582 and later.");
            } else {
                System.out.println("\n--- Part 1: Multiple if-else logic ---");
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is not a Leap Year");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }

                System.out.println("\n--- Part 2: Single if statement logic ---");
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid year.");
        }

        scanner.close();
    }
}
