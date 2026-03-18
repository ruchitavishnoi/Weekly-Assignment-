import java.util.Scanner;

public class level2ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter Details:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " at " + ages[youngestIndex] + " years old.");
        System.out.println("The tallest friend is " + names[tallestIndex] + " at " + heights[tallestIndex] + " cm tall.");
        
        scanner.close();
    }
}
