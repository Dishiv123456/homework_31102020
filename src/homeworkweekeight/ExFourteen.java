package homeworkweekeight;

import java.util.Scanner;

public class ExFourteen {
    //Write a program in Java to display the pattern like a diamond.   While loop
    public static void main(String[] args) {
        printDiamondShape();
    }

    static void printDiamondShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        System.out.print("Enter symbol : ");
        char sym = scanner.next().charAt(0);
        int i = 1;
        int j;
        while (i <= num) {
            j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {

                System.out.print(sym);
            }
            System.out.println();
            i++;
        }
        i = num - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= num - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(sym);
            }
            System.out.println();
            i--;
        }
    }

}


