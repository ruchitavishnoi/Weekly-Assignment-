import java.util.Scanner;

public class level1ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
      
        if (number > 0) {
            String[] results = new String[number];
            for (int i = 0; i < number; i++) {
                int currentValue = i + 1; 
                if (currentValue % 3 == 0 && currentValue % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (currentValue % 3 == 0) {
                    results[i] = "Fizz";
                } else if (currentValue % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(currentValue);
                }
            }
            System.out.println("\nFizzBuzz Table");
            
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer greater than 0.");
        }
        scanner.close();
    }
}
