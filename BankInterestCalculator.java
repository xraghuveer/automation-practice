public class BankInterestCalculator {

    public static long calcRate(long principal){
        if (principal <= 50000){
            return 10;
        } 
        else if (principal <= 100000) {
            return 12;
        }
        else {
            return 15;
        }
    }

    public static long calcInterest(long principal, long rate, int time){
        return (principal * rate * time) / 100;
    }

    public static long calcTax(long interest){
        return (interest * 10) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Principal: ");
        long principal = sc.nextLong();

        System.out.print("Input Year: ");
        int time = sc.nextInt();

        long rate = calcRate(principal);
        long interest = calcInterest(principal, rate, time);
        long tax = calcTax(interest);
        long finalInterest = interest - tax;
        long total = principal + finalInterest;

        System.out.println("Interest Rate = " + rate + "%");
        System.out.println("Interest = " + interest);
        System.out.println("Tax Deducted = " + tax);
        System.out.println("Interest After Tax Deduction = " + finalInterest);
        System.out.println("Total Amount Given To User = " + total);

        sc.close();
    }
}
