import java.util.Scanner;

public class FrequencyCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int input = sc.nextInt();
        System.out.println("Enter number for Frequency check");
        int freq = sc.nextInt();

        int count = 0;
        int temp = Math.abs(input);

        while (temp != 0) {
            int a = temp % 10;
            if (a == freq) {
                count++;
            }
            temp = temp / 10;
        }

        System.out.println("Frequency: " + count);
        sc.close();
    }
}
