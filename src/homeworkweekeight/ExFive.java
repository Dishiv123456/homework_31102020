package homeworkweekeight;

public class ExFive {
    /*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.  Check the tips below for more info about palindromes.

*/
    public static void main(String[] args) {

        System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int rev = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
            if (number == rev) {
                return true;
            }
        }
        return false;
    }

}
