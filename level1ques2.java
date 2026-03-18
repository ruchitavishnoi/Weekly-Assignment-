import java.util.Scanner;

public class level1ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nNumber Analysis");
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            
            if (currentNumber > 0) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is a positive even number.");
                } else {
                    System.out.println(currentNumber + " is a positive odd number.");
                }
            } else if (currentNumber < 0) {
                System.out.println(currentNumber + " is negative.");
            } else {
                System.out.println(currentNumber + " is zero.");
            }
        }
        System.out.println("\nFirst vs Last Element ");
        
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        if (firstElement == lastElement) {
            System.out.println("The first element (" + firstElement + ") is equal to the last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        }
        scanner.close();
    }
} 
