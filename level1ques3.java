import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        boolean isFirstLargest = (num1 >= num2) && (num1 >= num3);
        boolean isSecondLargest = (num2 >= num1) && (num2 >= num3);
        boolean isThirdLargest = (num3 >= num1) && (num3 >= num2);

        System.out.println("\nIs the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        input.close();
    }
}
