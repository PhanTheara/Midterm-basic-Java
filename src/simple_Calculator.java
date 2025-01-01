import java.util.Scanner;

public class simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("---------------------------");
            System.out.println("Press 1 to Add ");
            System.out.println("Press 2 to Subtract ");
            System.out.println("Press 3 to Multiply ");
            System.out.println("Press 4 to Divide ");
            System.out.println("Press 5 to Modulus ");
            System.out.println("Press 6 to Exit");
            System.out.println("=============================");
            System.out.print("Please choose an operation:");
            option = scanner.nextInt();

            if (option == 6) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Input value of number 1: ");
            double number1 = scanner.nextDouble();
            System.out.print("Input value of number 2: ");
            double number2 = scanner.nextDouble();

            boolean isNumber1Integer = number1 == (int) number1;
            boolean isNumber2Integer = number2 == (int) number2;
            boolean areBothIntegers = isNumber1Integer && isNumber2Integer;

            switch (option) {
                case 1:
                    if (areBothIntegers) {
                        int result = (int) number1 + (int) number2;
                        System.out.println("Sum = " + result);
                    } else {
                        double result = number1 + number2;
                        System.out.println("Sum = " + result);
                    }
                    break;

                case 2:
                    if (areBothIntegers) {
                        int result = (int) number1 - (int) number2;
                        System.out.println("Subtract = " + result);
                    } else {
                        double result = number1 - number2;
                        System.out.println("Subtract = " + result);
                    }
                    break;

                case 3:
                    if (areBothIntegers) {
                        int result = (int) number1 * (int) number2;
                        System.out.println("Multiply = " + result);
                    } else {
                        double result = number1 * number2;
                        System.out.println("Multiply = " + result);
                    }
                    break;

                case 4:
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        if (areBothIntegers) {
                            int result = (int) number1 / (int) number2;
                            System.out.println("Divide = " + result);
                        } else {
                            double result = number1 / number2;
                            System.out.println("Divide = " + result);
                        }
                    }
                    break;

                case 5:
                    if (number2 == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        if (areBothIntegers) {
                            int result = (int) number1 % (int) number2;
                            System.out.println("Modulus = " + result);
                        } else {
                            double result = number1 % number2;
                            System.out.println("Modulus = " + result);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option! Please choose a valid operation.");
            }

        } while (option != 6);

        System.out.println("GOOD BYTE !!! ");
    }
}
