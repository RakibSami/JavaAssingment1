// 27. LCM (Least Common Multiple)
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // find GCD first
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        // LCM = (a * b) / GCD
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}
