package homeworkweekeight;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /*-Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum  number. */

    public static void main(String[] args) {
        minMaxNumber();
    }

    static void minMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  first number  : ");
        int num1 = scanner.nextInt();
        System.out.print("enter second number  :  ");
        int num2 = scanner.nextInt();


        while (num1 < 0 || num2 < 0) {
            System.out.println("invalid number ");
            break;
        }
        int min =Math.min(num1, num2);
        System.out.println("Minimum value : "+min);
        int max = Math.max(num1, num2);

        System.out.println("Maximum value : "+max);
    }


}