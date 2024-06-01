package B_sxema;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog("bori");
        System.out.println(d.getName());
        d.sound();

        Duck duck = new Duck("kapitan");
        System.out.println(duck.getName());
        duck.sound();

        Cat cat = new Cat("yolbars");
        System.out.println(cat.getName());
        cat.sound();
    }
}
