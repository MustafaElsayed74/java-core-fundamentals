abstract class Car {
    abstract void drive();

    public static void playMusic() {
        System.out.println("Playing Music..");
    }
}

class Ford extends Car {

    @Override
    void drive() {
        System.out.println("Driving..");
    }

}

public class demo {

    public static void main(String args[]) {

        // Abstract class cannot be instantiated,we can create an object from abstract
        // class
        Car.playMusic();
    }

}
