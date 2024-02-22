// Class definition
class MyClass {
    private int num;

    // Default constructor
    public MyClass() {
        this.num = 0;
    }

    // Overloaded constructor
    public MyClass(int num) {
        this.num = num;
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.num = other.num;
    }

    // Getter method
    public int getNum() {
        return num;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        MyClass obj1 = new MyClass(); // Default constructor
        MyClass obj2 = new MyClass(10); // Overloaded constructor
        MyClass obj3 = new MyClass(obj2); // Copy constructor

        // Displaying the values
        System.out.println("Object 1: " + obj1.getNum()); // Output: 0
        System.out.println("Object 2: " + obj2.getNum()); // Output: 10
        System.out.println("Object 3: " + obj3.getNum()); // Output: 10
    }
}
