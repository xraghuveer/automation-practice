package objects;

import java.util.Scanner;

public class NegativePositiveChecker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int i = sc.nextInt();
       if (i<0){
        System.out.println(i+ " Number is Negative");}
       else{
        System.out.println(i+ " Number is Positive");}
    }
}
