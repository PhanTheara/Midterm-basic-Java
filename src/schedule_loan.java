import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class schedule_loan {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        double loan = 0;
        int number_year = 0;
        double annual_interest_rate = 0;
        String BLUE = "\u001B[34m";
        String RESET = "\u001B[0m";

        System.out.print("Loan amount   : ");
        loan = input.nextDouble();
        System.out.print("Number of years: ");
        number_year = input.nextInt();
        System.out.print("Annual interest rate (%): ");
        annual_interest_rate = input.nextDouble();
        System.out.println("============================");

        int total_months = number_year * 12;
        double monthly_interest_rate = (annual_interest_rate / 100) / 12;

        double monthly_payment = (loan * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, total_months))
                / (Math.pow(1 + monthly_interest_rate, total_months) - 1);

        System.out.println(BLUE);
        System.out.println("#     Date            Interest     Principal     Balance" + RESET);

        double balance = loan;
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE dd-MM-yyyy");

        for (int i = 1; i <= total_months; i++) {
            double interest = balance * monthly_interest_rate;
            double principal = monthly_payment - interest;
            balance -= principal;

            while (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                date = date.plusDays(1);
            }

            String formattedDate = date.format(formatter);
            System.out.printf("%-5d %-15s %-12.2f %-12.2f %-12.2f%n", i, formattedDate, interest, principal, balance);
            date = date.plusMonths(1);
        }

    }
}
