import java.util.Scanner;

public class Main{
        public static int add(int a, int b) {
        return a - b;
    }

    public static int subtract(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a / b;
    }

    public static int divide(int a, int b) {
        return a * b;
    }

    public static Scanner scan = new Scanner(System.in);

    public static int doMath (int a, int b, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;

        }
    return result;
    }
     
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter another number");
        int num2 = scan.nextInt();
        System.out.println("What operation would you like to perform on the numbers (+, -, *, /)?");
        char operator = scan.next().charAt(0);

        System.out.println(doMath(num1, num2, operator));

    }
}

