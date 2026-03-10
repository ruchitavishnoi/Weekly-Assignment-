import java.util.Scanner;

public class level2ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Congratulations! You are eligible for a bonus.");
            System.out.println("Your bonus amount is: " + bonus);
            System.out.println("Total salary with bonus: " + (salary + bonus));
        } else {
            System.out.println("You have " + years + " years of service. A bonus is only awarded after 5 years.");
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}
