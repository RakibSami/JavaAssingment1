// 20. Sum of series: 1 + 2/4 + 3/8 + 4/16 + ... + n/2^n
// (first term is 1/2, written as 1 in the question)
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i / Math.pow(2, i);
        }

        System.out.println("Sum of the series = " + sum);
    }
}
