import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDay = 0;
        int daysInMonth = 0;
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";

        System.out.print("Enter start day   : ");
        startDay = scanner.nextInt();
        System.out.print("Enter day in month: ");
        daysInMonth = scanner.nextInt();

        String weekHeaders = "Mo  Tu  We  Th  Fr  Sa  Su";
        System.out.println(RED + weekHeaders + RESET);

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }


        for (int currentDay = 1; currentDay <= daysInMonth; currentDay++) {
            System.out.printf("%-4d", currentDay);

            if ((currentDay + startDay - 1) % 7 == 0) {
                System.out.println();
            }


        }

        System.out.println();
        scanner.close();
    }
}
