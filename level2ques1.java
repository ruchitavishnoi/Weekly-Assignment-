import java.util.Scanner;

public class level2ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is an even number");
                    } else {
                        System.out.println(i + " is an odd number");
                    }
                }
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
