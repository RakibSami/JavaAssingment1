
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        // count the digit

        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // sum of each digit to the power of digits
        
        int sum = 0;
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
