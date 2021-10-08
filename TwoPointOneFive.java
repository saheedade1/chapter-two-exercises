package ChapterTwo.Exercises;

import java.util.Scanner;

public class TwoPointOneFive {
    //arithmetic
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstInteger;
        int secondInteger;

        System.out.println("Enter first integer: ");
        firstInteger = input.nextInt();

        System.out.println("Enter second inter: ");
        secondInteger = input.nextInt();

        int sum = firstInteger + secondInteger;
        int product = firstInteger * secondInteger;
        int difference = firstInteger - secondInteger;
        int quotient = firstInteger/secondInteger;

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The difference is " + difference);
        System.out.printf("The quotient is %d", quotient);
    }
}
