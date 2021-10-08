package ChapterTwo.Exercises;

import java.util.Scanner;

public class TwoPointFive {
    //program calculate the product of three integers
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int z;
        int result;

        System.out.print("Enter first integer for x: ");
        x = input.nextInt();

        System.out.print("Enter second integer for y: ");
        y = input.nextInt();

        System.out.print("Enter third integer for z: ");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d", result);

    }
}