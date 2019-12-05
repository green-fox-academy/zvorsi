public class twoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the remainder of 22 divided by 13

        byte a = 22;
        byte b = 13;

        System.out.println("a+b: " + a + b);
        System.out.println("a-b: " + (a - b));
        System.out.println("a*b: " + a * b);
        System.out.println("decimal fraction of a/b: " + (float) a / (float) b);
        System.out.println("intiger part of a/b: " + a / b);
        System.out.println("remainder part of a/b: " + a % b);



    }
}
