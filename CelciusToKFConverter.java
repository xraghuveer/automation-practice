import java.util.Scanner;

public class CelciusToKFConverter {
  public static void main(String args[]) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter The Celsius Value: ");
     double c = sc.nextDouble();

     double k = c + 273.15;
     double f = (c * 9 / 5) + 32;

     System.out.printf("%.2f Celsius = %.2f Fahrenheit\n%.2f Celsius = %.2f Kelvin",c, f, c, k);
  }
}