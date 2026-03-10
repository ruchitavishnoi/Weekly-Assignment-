import java.util.Scanner;

public class level3ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");

        if (sc.hasNextInt()) {
            int yr = sc.nextInt();
            if (yr >= 1582) {
                if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
                    System.out.println(yr + " is a Leap Year");
                } else {
                    System.out.println(yr + " is not a Leap Year");
                }
            } else {
                System.out.println("Year must be 1582 or later.");
            }
        }
        sc.close();
    }
}
