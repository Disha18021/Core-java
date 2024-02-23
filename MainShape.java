class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a generic shape.");
    }
}

class Rectangle extends Shape {
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Shape {
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        
        rectangle.calculateArea(5, 4);
        square.calculateArea(5);
    }
}
