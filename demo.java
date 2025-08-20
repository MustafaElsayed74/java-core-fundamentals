//Encapsulation => Separation of Data Definition (attributes - Access modifiers) from its usage (Methods - Getters/Setters)

class Human {

    private int age;
    private String name = "Mustafa";

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
        System.out.println("Hello from constructor");
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class demo {

    public static void main(String args[]) {

        Human human = new Human();
        human.setAge(23);
        System.out.println(human.getAge());

    }

}
