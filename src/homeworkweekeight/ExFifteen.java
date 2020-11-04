package homeworkweekeight;

public class ExFifteen {
    //Display left angle triangle of * using nested for loops  
    public static void main(String[] args) {
        leftAngleTriangle();
    }

    static void leftAngleTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
