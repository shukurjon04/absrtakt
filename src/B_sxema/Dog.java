package B_sxema;

public class Dog extends Animal {
    public Dog(String name) {
        super.name = name;
    }
    @Override
    public void sound() {
        System.out.println("bow bow");
    }

    @Override
    public String getName() {
        return name;
    }
}
