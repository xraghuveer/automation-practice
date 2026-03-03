public class Calculator {
    public static void main(String[] args) {
       calc(10 , 6);
    }
     static void calc(int a, int b){
            System.out.println("Sum: "+ (a+b));
            System.out.println("Product: "+ (a*b));
            System.out.println("Difference: "+(a-b));
            System.out.println("Average: "+((a+b)/2.0));
            System.out.println("Distance: "+ ((a>b)?(a-b):(b-a)));

            if (a>b){
                System.out.println("Max:"+a);
                System.out.println("Min:"+b);
            }
            else if(a==b){
                System.out.println("Both are same.");
            }
            else{
             System.out.println("Max: "+b);
             System.out.println("Min: "+a);
         }
    }
    static void calc(double a, double b){
            System.out.println("Sum: "+ (a+b));
            System.out.println("Product: "+ (a*b));
            System.out.println("Difference: "+(a-b));
            System.out.println("Distance: "+ ((a>b)?(a-b):(b-a)));

            if (a>b){
                System.out.println("Max:"+a);
                System.out.println("Min:"+b);
            }
            else if(a==b){
                System.out.println("Both are same.");
            }
            else{
             System.out.println("Max: "+b);
             System.out.println("Min: "+a);
         }
    }
}
