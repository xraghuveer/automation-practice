import java.util.Scanner;
public class SquareCubeFourth{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        long num = sc.nextLong();

        long square = num*num;
        long cube = num*num*num;
        long fourth = num*num*num*num;

        System.out.println("Square: "+square+"\nCube: "+cube+ "\nFourth Power: "+fourth);
    }
}
