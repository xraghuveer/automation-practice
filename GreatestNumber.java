package objects;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int i= sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int j= sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int k= sc.nextInt();
        int g;

        if(i>=j && i>=k){
            g=i;
        } else if(j>=i && j>=k){
            g=j;
        } else{
            g=k;
        }
        System.out.println(g);
    }
}
