package B_sxema;

public class Cat extends Animal {
    public Cat(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return name ;
    }

    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}
