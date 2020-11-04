package homeworkweekeight;

public class ExEleven {
    /*Write a method named getEvenDigitSum with one parameter of type int called number.  The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid */

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            if (rem % 2 == 0) {
                sum = sum + rem;

            }
        }
        return sum;
    }
}