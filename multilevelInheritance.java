import java.util.Scanner;

class A {
    int a, b, c;

    // Parameterized constructor
    A(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Class A constructor called: a=" + a + ", b=" + b);
    }

    void add() {
        c = a + b;
        System.out.println("Sum of two numbers: " + c);
    }

    void sub() {
        c = a - b;
        System.out.println("Subtraction of two numbers: " + c);
    }
}

class B extends A {
    // Constructor calls A's constructor using super(a,b)
    B(int a, int b) {
        super(a, b);
        System.out.println("Class B constructor called");
    }

    void multi() {
        c = a * b;
        System.out.println("Multiplication of two numbers: " + c);
    }

    void div() {
        if (b != 0) {
            c = a / b;
            System.out.println("Division of two numbers: " + c);
        } else {
            System.out.println("Error: Division by zero not allowed!");
        }
    }
}

class C extends B {
    // Constructor calls B’s constructor (which calls A’s)
    C(int a, int b) {
        super(a, b);
        System.out.println("Class C constructor called");
    }

    void rem() {
        if (b != 0) {
            c = a % b;
            System.out.println("Remainder of two numbers: " + c);
        } else {
            System.out.println("Error: Division by zero not allowed!");
        }
    }
}

class multilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // When creating C, it calls B → A via super(a,b)
        C r = new C(a, b);

        System.out.println();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();

        sc.close();
    }
}
