// 25. Leap Year (using ternary operator)
import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "is a Leap year"
                : "is not a Leap year";

        System.out.println(year + " " + result);
    }
}
