public class Cat extends Animal implements Playeble{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void play() {
        System.out.println("Caught the mouse");
    }
}
