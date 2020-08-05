public class Dog extends Animal implements Playeble{

    public Dog() {
        super();

    } public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void play() {
        System.out.println("Caught the ball");
    }
}
