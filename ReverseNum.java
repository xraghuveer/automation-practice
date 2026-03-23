import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number To Reverse");
        int input = sc.nextInt();
        int rev = 0;

        while (input != 0) {
            int a = input % 10;
            rev = rev * 10 + a;
            input = input / 10;
        }

        System.out.println(rev);
        sc.close();
    }
}
