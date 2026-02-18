import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // i. Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // ii. Character at second and fourth position
        if (length >= 4) {
            System.out.println("Character at second position: " + str.charAt(1));
            System.out.println("Character at fourth position: " + str.charAt(3));
        } else {
            System.out.println("String is too short to get second and fourth characters.");
        }

        // iii. Find substring using start index only
        if (length > 2) {
            String sub = str.substring(2);  // starts from index 2 to end
            System.out.println("Substring from index 2: " + sub);
        } else {
            System.out.println("String is too short to get substring from index 2.");
        }

        sc.close();
    }
}


