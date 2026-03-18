import java.util.Scanner;

public class level2ques6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        System.out.println("\n--- Enter Details ---");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            System.out.print("  Weight (in kg): ");
            weights[i] = scanner.nextDouble();
            
            System.out.print("  Height (in meters): ");
            heights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + " -> " +
                    "Height: " + heights[i] + "m, " +
                    "Weight: " + weights[i] + "kg, " +
                    "BMI: " + bmis[i] + ", " +
                    "Status: " + statuses[i]);
        }

        scanner.close();
    }
}
