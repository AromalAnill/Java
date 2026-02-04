import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;


        while (true) {
            System.out.print("Enter number of strings: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine();
                if (n > 0) {
                    break; 
                } else {
                    System.out.println("Number must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            }
        }


        String[] s = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }


        Arrays.sort(s);


        System.out.println("Sorted strings:");
        for (String str : s) {
            System.out.println(str);
        }

        sc.close();
    }
}

