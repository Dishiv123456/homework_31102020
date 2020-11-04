package homeworkweekeight;

public class ExNine {
    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
    public static void main(String[] args) {
        ExNine exNine = new ExNine();
        exNine.fibonacciNumber();
    }

    void fibonacciNumber() {
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci numbers are as below : ");
        System.out.print("  " + b);
        for (int i = 0; i <= 6; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
