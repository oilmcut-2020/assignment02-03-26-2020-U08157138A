package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int number1; // first number to add
        int number2; // second number to add
        int a;
        int sum; // sum of number1 and number2
        a = sca.nextInt();
        if (a==1) {
            System.out.print("Enter first integer: "); // prompt
            number1 = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            number2 = input.nextInt(); // read second number from user

            sum = number1 - number2; // add numbers, then store total in sum

            System.out.printf("Sum is %d%n", sum);
        }
        if (a==2) {
            System.out.print("Enter first integer: "); // prompt
            number1 = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            number2 = input.nextInt(); // read second number from user

            sum = number1 * number2; // add numbers, then store total in sum

            System.out.printf("Sum is %d%n", sum);
        }
        if (a==3) {
            System.out.print("Enter first integer: "); // prompt
            number1 = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            number2 = input.nextInt(); // read second number from user

            sum = number1 / number2; // add numbers, then store total in sum

            System.out.printf("Sum is %d%n", sum);
        }
    }
}
