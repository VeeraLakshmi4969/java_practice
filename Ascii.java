public class Ascii {
    public static void main(String args[]) {

        // Declare a character variable
        char ch = 'c';

        // ASCII value of 'A' is 65
        int j = 65;

        // ASCII value of 'a' is 97
        int i = 97;

        // Implicit type conversion (widening)
        // char is automatically converted to int
        // ASCII value of 'c' is stored in n
        int n = ch;

        // Prints the ASCII value of 'c'
        System.out.println(n);          // Output: 99

        // Explicit type casting
        // Converts integer 97 to its corresponding character
        System.out.println((char) i);   // Output: a

        // j = 65 ('A')
        // 65 + 1 = 66 -> 'B'
        System.out.println((char) (j + 1)); // Output: B

        // 65 + 2 = 67 -> 'C'
        System.out.println((char) (j + 2)); // Output: C

        // Explicit casting from char to int
        // Prints the ASCII value of 'c' directly
        System.out.println((int) ch);   // Output: 99
    }
}