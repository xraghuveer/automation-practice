public class NonParMethods{
    public static void main(String[] args) {
        greet();
        NonParMethods a1 = new NonParMethods();
        a1.announce();
    }
    static void greet(){
        System.out.println("Hello");
    }
    void announce(){
        System.out.println("Train No. 6353 is arriving on PF No. 2");
    }
}
