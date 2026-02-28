public class ClassesForObjectsNMore {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.name = "Raghuveer";
        h1.age = 26;
        h1.gender = "Male";
        h1.speak("Hello");

        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "S23";
        phone.batteryPercentage = 85;
        phone.makeCall("9876543210");

        System.out.println(h1.name + " is using " + phone.brand + " " + phone.model);

        Desktop d = new Desktop();
        d.processor = "Intel i7";
        d.ram = 16;
        d.storage = 512;
        d.start();

        College c = new College();
        c.name = "XYZ College";
        c.location = "Bhubaneswar";
        c.numOfStudents = 2000;
        c.displayCollege();

        TestSuite ts = new TestSuite();
        ts.suiteName = "Login Suite";
        ts.totalTestCases = 5;
        ts.environment = "QA";
        ts.runSuite();

        TestCase tc = new TestCase();
        tc.testCaseId = "TC01";
        tc.description = "Login functionality";
        tc.status = "Passed";
        tc.showTestCase();

        TestStep step = new TestStep();
        step.stepNumber = 1;
        step.action = "Enter username";
        step.expectedResult = "Username accepted";
        step.executeStep();

        Car car = new Car();
        car.brand = "BMW";
        car.color = "Black";
        car.speed = 120;
        car.drive();

        Book book = new Book();
        book.title = "Java Basics";
        book.author = "James";
        book.price = 499.99;
        book.showBook();

        Employee emp = new Employee();
        emp.name = "Amit";
        emp.employeeId = 101;
        emp.salary = 50000;
        emp.viewEmployee();

        Laptop laptop = new Laptop();
        laptop.brand = "Dell";
        laptop.ram = 16;
        laptop.processor = "i5";
        laptop.startLaptop();

        BankAccount acc = new BankAccount();
        acc.holderName = "Raghuveer";
        acc.accountNumber = 1234567890;
        acc.balance = 10000;
        acc.showBalance();
    }
}
class Human{
    String name;
    int age;
    String gender;

    void speak(String content){
        System.out.println(name+"-"+content);
    }
}
class MobilePhone {
    String brand;
    String model;
    int batteryPercentage;

    void makeCall(String number) {
        System.out.println("Calling " + number + " from " + brand + " " + model);
    }
}

class Desktop {
    String processor;
    int ram;
    int storage;

    void start() {
        System.out.println("Desktop started with " + processor + ", RAM: " + ram + "GB");
    }
}

class College {
    String name;
    String location;
    int numOfStudents;

    void displayCollege() {
        System.out.println("College: " + name + " in " + location + ", Students: " + numOfStudents);
    }
}

class TestSuite {
    String suiteName;
    int totalTestCases;
    String environment;

    void runSuite() {
        System.out.println("Running Suite: " + suiteName + " in " + environment);
    }
}

class TestCase {
    String testCaseId;
    String description;
    String status;

    void showTestCase() {
        System.out.println("TestCase: " + testCaseId + " - " + description + " - Status: " + status);
    }
}

class TestStep {
    int stepNumber;
    String action;
    String expectedResult;

    void executeStep() {
        System.out.println("Step " + stepNumber + ": " + action + " -> Expected: " + expectedResult);
    }
}

class Car {
    String brand;
    String color;
    int speed;

    void drive() {
        System.out.println(brand + " car driving at " + speed + " km/h");
    }
}

class Book {
    String title;
    String author;
    double price;

    void showBook() {
        System.out.println("Book: " + title + " by " + author + " Price: ₹" + price);
    }
}

class Employee {
    String name;
    int employeeId;
    double salary;

    void viewEmployee() {
        System.out.println("Employee: " + name + ", ID: " + employeeId + ", Salary: ₹" + salary);
    }
}

class Laptop {
    String brand;
    int ram;
    String processor;

    void startLaptop() {
        System.out.println("Laptop " + brand + " started with " + ram + "GB RAM");
    }
}

class BankAccount {
    String holderName;
    long accountNumber;
    double balance;

    void showBalance() {
        System.out.println("Account Holder: " + holderName + ", Balance: ₹" + balance);
    }
}
