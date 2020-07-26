import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingOfAnimal {
    static String name;
    static int age;
    static int type;

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
        List<Animal> animals = new ArrayList();
        if (type == 2) {
            animals.add(new Dog(name, age));
        } else if (type == 1) {
            animals.add(new Cat(name, age));}
        else {
            System.out.println("Вы указали неверное животное");
        }
        return (ArrayList) animals;
    }
}
