import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingOfAnimal {
    static String name;
    static int age;
    static int type;
    static List<Animal> animals = new ArrayList();

    public static void setNameAgeType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите имя животного ");
        name = scanner.nextLine();
        System.out.println("Укажите возраст животного ");
        age = scanner.nextInt();
        System.out.println("Укажите тип вашего животного (Собака - 1 или Кот - 2)");
        type = scanner.nextInt();
    }

    public static ArrayList getAnimalsList(int type) {
       if (type == 1) {
            animals.add(new Dog(name, age));
        } else if (type == 2) {
            animals.add(new Cat(name, age));}
        else {
            System.out.println("Вы указали неверное животное");
        }
        return (ArrayList) animals;
    }

    public static void playingWithAnimal() {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).play();
        }
    }

}
