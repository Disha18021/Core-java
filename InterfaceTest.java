class X implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++)
            System.out.println("\tThreadX: " + i);
        System.out.println("End of ThreadX");
    }
}

class RunnableTest {
    public static void main(String args[]) {
        X runnable = new X();
        Thread threadX = new Thread(runnable); // Step 3
        threadX.start();
        System.out.println("End of main Thread");
    }
}

interface Area { // Interface defined
    final static float pi = 3.14F;
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area {
    // Another implementation
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

class InterfaceTest {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;

        area = rect; // Interface object, area refers to rect object
        System.out.println("Area of Rectangle: " + area.compute(10, 20));

        area = cir; // area refers to cir object
        System.out.println("Area of Circle: " + area.compute(10, 0));
    }
}
