/**
 * Execises to practice the basic syntax
 */
public class Basics {

    public static void main(String[] args) {
        // TODO: Write a Java program to print the sum of two numbers.
        int x = 10;
        int y = 20;
        int result = x + y ;
        System.out.println("The sum is" + result);


        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles.
        int a = 20;
        int b = 10;
        int division;
        division = a/b;
        System.out.println("The divide is " + division);



        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        int c = 4;
        int d = 2;
        int sum;
        int multiply;
        int subtract;
        int division1;
        sum = c + d;
        multiply = c*d;
        subtract = c-d;
        division1 = c/d;
        System.out.println("the addition is " + sum);
        System.out.println("the mltiply is " + multiply);
        System.out.println("the subtract is " + subtract);
        System.out.println("the division is " + division1);








        // TODO: Write a Java program to swap two variables. Print the before and after switchin.
        int yy, xx;
        yy = 8;
        xx = 2;
        int tt = xx;
        xx = yy;
        yy = tt;
        System.out.println("/n" + xx "/n" + yy);
    }
}
