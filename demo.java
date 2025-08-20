import java.net.Socket;

class Mobile {
    String brand;
    double price;
    static String name; // Class Member Variable - Static Variable

    // Object member method - Non-static Method
    public void show() {
        System.out.println(String.format("Name: %s Price: %s Brand %s", name, price, brand));
    }

    public static void show1(Mobile mobile) {
        System.out.println("Name: " + name + " Price: " + mobile.price + " Brand: " + mobile.brand);
    }
}

public class demo {

    void add() {

    }

    public static void main(String args[]) {

        Mobile mobile = new Mobile();

        mobile.brand = "Samsong";
        mobile.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile mobile1 = new Mobile();

        mobile1.brand = "Apple";
        mobile1.price = 1700;
        Mobile.name = "Phone";
        mobile.show();
        Mobile.show1(mobile1);
    }

}
