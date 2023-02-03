package abstractpack;

public class AbstractPack {
    public static void main (String[] args) {
        Cat cat = new Cat("Lusha", 6);
        Dog dog = new Dog("Lucky", 10);
        cat.say();
        dog.say();
    }
}
