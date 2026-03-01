public class VoidMethod {
    public static void main(String[] args) {

        Human h = new Human();
        h.introduce("Raghuveer");

        Human.introducer("Ramesh");
    }
}

class Human {
    void introduce(String name) {
        System.out.println("Hello! I am " + name);
    }
   static void introducer(String name) {
        System.out.println("Hello! I am " + name +" but in static.");
   }
}
