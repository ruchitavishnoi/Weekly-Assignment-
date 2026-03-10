import java.util.Scanner;

public class level1ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter number2: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter number3: ");
        double num3 = input.nextDouble();

        boolean isSmallest = (num1 <= num2) && (num1 <= num3);

        System.out.println("Is the first number the smallest? " + isSmallest);
        
        input.close();
    }
}
