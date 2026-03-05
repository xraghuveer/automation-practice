public class ParMethods{
    public static void main(String[] args) {
        greet("Raghuveer");
        ParMethods a1 = new ParMethods();
        a1.announce(23234 , 2);
    }

    static void greet(String name){
        System.out.println("Hello! I am " + name);
    }

    void announce(int trainNumber ,int pfNumber ){
        System.out.println("Train No. " + trainNumber + " is arriving on PF No. " + pfNumber);
    }
}
