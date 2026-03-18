import java.util.Scanner;

public class level1ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] heights = new double[11];
        double sum = 0.0;
        
        System.out.println("Enter the heights of the 11 football players:");
        
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; 
        }
        
        double mean = sum / 11;
        
        System.out.println("\n The mean height of the football team is: " + mean);
        
        scanner.close();
    }
}
