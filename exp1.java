class Number {
    int a, b;

    // Default constructor
    Number() {
        a = 0;
        b = 0;
    }

    // Constructor with two parameters
    Number(int x, int y) {
        a = x;
        b = y;
    }

    // Constructor with one parameter (both a and b same)
    Number(int z) {
        a = b = z;
    }

    // Method to display values
    void put() {
        System.out.println("Values of a and b are:");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

class ConOverloadDemo {
    public static void main(String args[]) {
        // Using two-argument constructor
        Number N1 = new Number(10, 20);
        System.out.println("Variables are initialized using Constructor:");
        N1.put();

        // Using one-argument constructor
        Number N2 = new Number(50);
        System.out.println("\nAfter Overloading a Constructor:");
        N2.put();

        // Using default constructor
        Number N3 = new Number();
        System.out.println("\nUsing Default Constructor:");
        N3.put();
    }
}
