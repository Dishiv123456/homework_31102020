package homeworkweekeight;

public class ExThirteen {
    /*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not  within the range, the
method should return false. The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.  */

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25, 12));
    }

    public static boolean hasSharedDigit(int a, int b) {
        boolean answer = false;
        int leftA = a / 10;
        int rightA = a % 10;
        int leftB = b / 10;
        int rightB = b % 10;
        if (a>=10 && b<=99){
        if (leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB) {
            answer = true;
        }
        return answer;
    }return false;

}}