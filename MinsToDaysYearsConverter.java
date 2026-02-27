import java.util.Scanner;
public class MinsToDaysYearsConverter{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Minutes: ");
        long mins = sc.nextLong();

        long year = mins/525600;
        long days = mins/1440;

        System.out.println(mins+" Minutes is "+days+" Days and "+year+" Year");
    }
}
