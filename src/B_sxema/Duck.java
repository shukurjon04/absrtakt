package B_sxema;

public class Duck extends Animal{
    public Duck(String name) {
        super.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }
}
