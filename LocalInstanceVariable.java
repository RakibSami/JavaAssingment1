// 23. Use of local and instance variable

public class LocalInstanceVariable {
    // instance variable (belongs to the object)
    int instanceVar = 10;

    void show() {
        // local variable (only exists inside this method)
        int localVar = 20;

        System.out.println("Instance variable = " + instanceVar);
        System.out.println("Local variable = " + localVar);
    }

    public static void main(String[] args) {
        LocalInstanceVariable obj = new LocalInstanceVariable();
        obj.show();
    }
}
