class A {
    int i; // public by default

    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A's j is not accessible here.

class B extends A {
    int total;

    void sum() {
        // ERROR, j is not accessible here
        // total = i + j;
        // Uncomment the line above if you want to access j from B
        total = i;
    }
}

class Access2 {
    public static void main(String args[]) {
        B subob = new B();
        subob.setij(10, 12);
        subob.sum();
        System.out.println("Total is " + subob.total);
    }
}