package Question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
    String input = sc.nextLine();

    // Parse the birthdate
    LocalDate birthDate = LocalDate.parse(input);

    // Get current date
    LocalDate currentDate = LocalDate.now();

    // Calculate the period between the two dates
    Period age = Period.between(birthDate, currentDate);

    // Display result
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());

}
}
/*

Output
Enter your birthdate (yyyy-mm-dd): 1990-05-15
Your age is: 35 years, 5 months, and 28 days.
*/

