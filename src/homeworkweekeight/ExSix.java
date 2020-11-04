package homeworkweekeight;

public class ExSix {
    /* Write a program in Java to display the pattern like a triangle with a number.   For eg.
 Input number of rows: 10
 Expected Output:  */
    public static void main(String[] args) {

        triangle();
    }

    public static void triangle(){
        //used nested for loop to print numeric triangle  pattern
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {


                System.out.print(j);

            }
            System.out.println();

            }
        //out put  1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567
        // 12345678
        // 123456789
        // 12345678910
        }
    }
