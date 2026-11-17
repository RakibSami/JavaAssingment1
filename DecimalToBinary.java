
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binary = 0");
            return;
        }

        String binary = "";
        int temp = n;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }

        System.out.println("Binary of " + n + " = " + binary);
    }
}
