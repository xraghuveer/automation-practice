import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first+" ");
        while(second<=limit){
            System.out.print(second+ " ");
            int next = first+second;
            first=second;
            second=next;
        }
        sc.close();
    }
}
