package ChapterTwo.Exercises;

import java.util.Scanner;

public class TwoPointOneSeven {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        int sum;
        int average;
        int product;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = input.nextInt();

        System.out.println("Enter third number: ");
        thirdNumber = input.nextInt();

        sum = firstNumber + secondNumber + thirdNumber;
        System.out.printf("The sum is %d", sum);
        System.out.println();

        average = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.printf("The average is %d", average);
        System.out.println();

        product = firstNumber * secondNumber * thirdNumber;
        System.out.printf("The product is %d ", product);

        if (firstNumber > secondNumber && secondNumber > thirdNumber)
            System.out.printf("%d larger number", firstNumber);
//        && System.out.printf();
//        else System.out.println("%d smallest number", firstNumber);


    }
}
