package homeworkweekeight;

public class ExSeven {
    /*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,  using a loop and return the sum of the first and the last digit of that number.
 */
    public static void main(String[] args) {
        System.out.println(   sumFirstAndLastDigit(125));

    }
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int lastDigit, firstDigit;
            int sum =0;
            //to fine last digit
            lastDigit =number%10;
            firstDigit =number;
            while (firstDigit>=10) {
                // ti fine first digit
                firstDigit = firstDigit / 10;
                sum = (lastDigit + firstDigit);
            }    return sum;

        }
        return -1;
    }

}
