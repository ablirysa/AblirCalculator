import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String input = scan.nextLine();
        int space = input.indexOf(" ");
        double num1 = Double.parseDouble(input.substring(0, space));
        double num2 = Double.parseDouble(input.substring(space + 3)); // 2nd num is always 3 away
        Calculator nums = new Calculator(input, num1, num2);

        System.out.println("Result: " + nums.getAnswer());
    }
}
