import java.util.*;
public class Calculator {
    static void main() {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    String op = sc.next(); //op variable is string that we will be taking from keyboard
    char operator = op.charAt(0);//operator variable is character At 0 of op variable string
    double b = sc.nextDouble();
    double sum = a+b;
    double Minus = a-b;
     double Divide = a/b;
     double Multiply = a*b;
     double Remainder = a%b;
    switch (operator){
        case '+': //java requires characters to be wrraped in single quotes here

            System.out.println(sum);
            break;
        case '-':
            System.out.println(Minus);
            break;
        case '/':
            System.out.println(Divide);
            break;
        case '*':
            System.out.println(Multiply);
            break;
        case '%':
            System.out.println(Remainder);
            break;
        default:
            System.out.println("invalid");
    }


    }
}
/* //BELOW IS GPT VERSION OF CALCULATOR COMPARE AND CONTRAST AND LEARN
import java.util.Scanner;

public class gpt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Symbol Based Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

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
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}

 */