import java.util.Scanner;

public class level1ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        
        System.out.println("Enter the ages of the 10 students:");
        
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];
            
            if (currentAge < 0) {
                System.out.println("Invalid age");
            } else if (currentAge >= 18) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                System.out.println("The student with the age " + currentAge + " can't vote.");
            }
        }
        
        scanner.close();
    }
}
