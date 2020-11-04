package homeworkweekeight;

import java.util.Scanner;

public class ExTwelve {
    //Write a programme to input any number and check if it is prime or not.

    public static void main(String[] args) {
primeOrNot();
    }
    public static void primeOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check prime or not :");
        int number = scanner.nextInt();
        int prime = 0;
        int num = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " Number is not a prime ");
        } else {
            for (int i = 2; i < num; i++) {
                if (number % i == 0) {
                    System.out.println(number + " Number is not a prime ");
                    prime = 1;
                    break;
                }

            }
            if (prime == 0) {
                System.out.println(number + " Number is prime ");
            }

        }
    }
}
