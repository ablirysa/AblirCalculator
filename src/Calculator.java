public class Calculator {
    // instance variables
    private String exp;
    private double num1;
    private double num2;

    // constructor
    public Calculator (String exp, double num1, double num2) {
        this.exp = exp;
        this.num1 = num1;
        this.num2 = num2;
    }

    // determine which equation
    public double getAnswer() {
        // finds operation in expression
        int add = exp.indexOf("+");
        int sub = exp.indexOf("-");
        int mul = exp.indexOf("*");
        int div = exp.indexOf("/");
        int exponent = exp.indexOf("^");
        int mod = exp.indexOf("%");
        double ans = 0.0;

        // decides which operation
        if (add != -1) {
            ans = num1 + num2;
        }
        if (sub != -1) {
            ans = num1 - num2;
        }
        if (mul != -1) {
            ans = num1 * num2;
        }
        if (div != -1) {
            ans = num1 / num2;
        }
        if (exponent != -1) {
            ans = Math.pow(num1, num2);
        }
        if (mod != -1) {
            ans = num1 % num2;
        }

        return ans;
    }
}
