import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Float num1, num2, result;
            char operator;

            System.out.print("Enter the first number: ");
            num1 = scanner.nextFloat();
                                            
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            num2 = scanner.nextFloat();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}

