public class AdvCalculator extends Calculator {

    public int Multi(int a, int b) {
        return a * b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("From AdvCalculator");
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
