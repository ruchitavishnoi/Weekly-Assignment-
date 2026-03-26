import java.util.Scanner;

public class level3ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 

        // We print the title right here, exactly once!
        System.out.println("\n--- Digit Frequencies ---");

        if (num == 0) {
            System.out.println("Digit 0 occurs 1 time(s)");
            scanner.close();
            return;
        }

        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;            
        }

        int[] freq = new int[10]; 
        
        for (int i = 0; i < count; i++) {
            int currentDigit = digits[i];
            freq[currentDigit]++; 
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
