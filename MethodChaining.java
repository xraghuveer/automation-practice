class MethodChaining {
    MethodChaining method1() {
        System.out.println("Method 1");
        return this;
    }

    MethodChaining method2() {
        System.out.println("Method 2");
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        new MethodChaining().method1().method2();
    }
}
