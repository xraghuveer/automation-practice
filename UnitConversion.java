import java.util.Scanner;

public class UnitConversion {
  public static void main(String args[]) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter The Value in Inches: ");
     double i = sc.nextDouble();
     double m = i*0.0254;
     System.out.printf("%.2f Inches = %.2f Metres", i, m);
  }
}