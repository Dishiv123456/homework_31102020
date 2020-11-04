package homeworkweekeight;

public class Exeight {
    /* Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@   */
    public static void main(String[] args) {
        Exeight exeight = new Exeight();
        exeight.trianglePattern();
    }
//used nested for loop to print @ triangle
    void trianglePattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");

            }
            System.out.println();

        }

    }

}
