package homeworkweekeight;

import java.util.Scanner;

public class ExThree {

    /*Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
    For eg:
     Input an alphabet: p
     Expected Output:
     Input letter is Consonant  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter single character from Alphabet : ");
        String alphabet = scanner.next().toLowerCase();
        boolean uppercase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
        boolean lowercase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
        boolean vowels = alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i")
                || alphabet.equals("o") || alphabet.equals("u");

        if (alphabet.length() > 1) {
            System.out.println(" please enter single alphabet this is not a single alphabet ");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error message ..not a letter enter uppercase or lowercase letter ");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }

}



