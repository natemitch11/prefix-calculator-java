import calc.Arithmetic;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your equation (operators: +, -, *, /, %, square, cube, pow) 'q' to quit > ");
            String userInput = input.nextLine();

            String[] tokens = userInput.split(" ");

            if (tokens[0].equals("q")) {
                System.out.println("You will exit.");
                break;
            } else if (tokens.length < 2) {
                System.out.println("Not enough inputs.");
                continue;
            }

            String operator = tokens[0];
            String num1 = tokens[1];
            String num2;

            if (tokens.length < 3) {
                num2 = "0";
            } else {
                num2 = tokens[2];
            }

            double num1Double;
            double num2Double;

            try {
                num1Double = Double.parseDouble(num1);
                num2Double = Double.parseDouble(num2);
            } catch (NumberFormatException e) {
                System.out.println("Those aren't numbers!");
                continue;
            }

            double result;
            switch (operator) {
                case "+" -> {
                    result = Arithmetic.add(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                case "-" -> {
                    result = Arithmetic.subtract(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                case "*" -> {
                    result = Arithmetic.multiply(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                case "/" -> {
                    result = Arithmetic.divide(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                case "square" -> {
                    result = Arithmetic.square(num1Double);
                    System.out.println("Answer: " + result);
                }
                case "cube" -> {
                    result = Arithmetic.cube(num1Double);
                    System.out.println("Answer: " + result);
                }
                case "pow" -> {
                    result = Arithmetic.power(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                case "%" -> {
                    result = Arithmetic.mod(num1Double, num2Double);
                    System.out.println("Answer: " + result);
                }
                default -> System.out.println("Please provide an operator and two numbers.");
            }
        }
    }
}





