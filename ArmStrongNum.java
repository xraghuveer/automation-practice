import java.util.Scanner;

public class ArmStrongNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int input = sc.nextInt();
      
        int cubes = 0;
        int temp = Math.abs(input);

        while (temp != 0) {
            int a = temp % 10;
            cubes += (int) Math.pow(a, 3);
            temp = temp / 10;
        }

        System.out.println(cubes==input);
        sc.close();
    }
}
