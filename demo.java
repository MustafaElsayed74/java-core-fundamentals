class A {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int a) {
        System.out.println("In A int");
    }
}

class B extends A {

    public B() {
        super();

        System.out.println("In B");
    }

    public B(int a) {
        this();
        System.out.println("In B int");
    }
}

public class demo {

    public static void main(String args[]) {
        B b = new B(2);
    }

}
