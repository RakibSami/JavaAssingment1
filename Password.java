// 21. Password check (using do-while)
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "1234";
        String input;

        do {
            System.out.print("Enter password: ");
            input = sc.next();

            if (!input.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }
        } while (!input.equals(correctPassword));

        System.out.println("Login successful!");
    }
}
