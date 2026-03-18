import java.util.Scanner;

public class level2ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        if (number == 0) {
            System.out.println("The reversed number is: 0");
            scanner.close();
            return;
        }

        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10; 
        }

        int[] digits = new int[count];
        temp = number;
      
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;           
        }

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        System.out.print("The reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        scanner.close();
    }
}
