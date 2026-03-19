public class MethodCall{
    public static void main(String[] args) {
        printSquare(square(5));
    }

    static int square(int x) {
        return x * x;
    }

    static void printSquare(int n) {
        System.out.println(n);
    }
}
