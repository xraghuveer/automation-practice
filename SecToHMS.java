import java.util.Scanner;

public class SecToHMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isec = sc.nextInt();
        int hours = isec / 3600;
        int minutes = (isec % 3600) / 60;
        int seconds = isec % 60;

        System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");
        sc.close();
    }
}
