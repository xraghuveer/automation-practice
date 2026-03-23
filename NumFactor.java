import java.util.Scanner;

public class NumFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int input = sc.nextInt();
        int b = 1;

        while (b < input ) {
            if (input%b == 0){
                System.out.print(b+",");
            }
            b++;
        }
        System.out.print(input);
        sc.close();
    }
}
