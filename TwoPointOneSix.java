package ChapterTwo.Exercises;

import java.util.Scanner;

public class TwoPointOneSix {
    //Comparing Integers

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = input.nextInt();

        if (firstNumber > secondNumber)

//        if (firstNumber > secondNumber || secondNumber >firstNumber)
            System.out.printf("%d is larger", firstNumber);
        else
            System.out.printf("%d is larger", secondNumber);
//            System.out.printf("%d is larger ", firstNumber | secondNumber);
        System.out.println("");
        if (firstNumber == secondNumber)
            System.out.printf("%d == %d These numbers are equal", firstNumber, secondNumber);
    }
}
