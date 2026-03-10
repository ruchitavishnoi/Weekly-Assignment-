import java.util.Scanner;

public class level2ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("Multiplication table for " + number + " (from 6 to 9):");
                
                for (int i = 6; i <= 9; i++) {
                    int result = number * i;
                    System.out.println(number + " * " + i + " = " + result);
                }
            } else {
                System.out.println("The number " + number + " is not a natural number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
