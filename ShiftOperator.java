// 24. Use of shift operator

public class ShiftOperator {
    public static void main(String[] args) {
        int a = 8;
        int b = -8;

        // left shift: multiplies by 2 for each shift
        System.out.println("8 << 1 = " + (a << 1));   // 16
        System.out.println("8 << 2 = " + (a << 2));   // 32

        // right shift: divides by 2 for each shift
        System.out.println("8 >> 1 = " + (a >> 1));   // 4
        System.out.println("8 >> 2 = " + (a >> 2));   // 2

        // signed vs unsigned right shift
        System.out.println("-8 >> 1 = " + (b >> 1));   // -4
        System.out.println("-8 >>> 1 = " + (b >>> 1)); // large positive number
    }
}
