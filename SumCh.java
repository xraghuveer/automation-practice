import java.util.Scanner;

public class SumCh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        int sum = 0;

       for (char ch: str.toCharArray()){
           if (Character.isDigit(ch)){
               num = num*10+(ch-'0');
           } else if (num>0) {
               sum+=num;
               num=0;
           }
       }
        System.out.println(sum+num);
        sc.close();
    }
}
