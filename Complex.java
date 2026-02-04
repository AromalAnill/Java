import java.util.Scanner;

class Complex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter real and imaginary part of second complex number: ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Sum = " + (a + c) + " + " + (b + d) + "i");

        sc.close();
    }
}


// Enter real and imaginary part of first complex number: 2 3
// Enter real and imaginary part of second complex number: 4 5
// Sum = 6 + 8i
