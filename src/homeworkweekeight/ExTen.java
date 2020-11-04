package homeworkweekeight;


import java.util.Scanner;

public class ExTen {
    //Write a program to input any number and check if it Armstrong number or not

    public static void main(String[] args) {
        ExTen exTen = new ExTen();
        exTen.armstrongNumber();
    }

    void armstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong or not : ");
        int num = scanner.nextInt();
        int t1 = num;
        int length = 0;
        //153 = (1*1*1)+(5*5*5)+(3*3*3)    this if the formula to find Armstrong number
        while (t1 != 0) {
            t1 = t1 / 10;
            length = length + 1;
        }
        int t2 = num;
        int arm = 0;
        int rem;
        while (t2 != 0) {
            int mul = 1;
            rem = t2 % 10;
            for (int i = 1; i <= length; i++) {

                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if (arm == num) {
            System.out.println(num + "  :  is an Armstrong number");
        } else
            System.out.println(num + "  :  is not an Armstrong number ");
    }
}