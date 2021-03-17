package Lesson5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести дистанцию для бега: ");
        float distanceRun = in.nextInt();
        System.out.println("Ввести дистанцию для плаванья: ");
        float distanceSwim = in.nextInt();
        System.out.println("Ввести высоту прыжка: ");
        float distanceJump = in.nextInt();

        Cat CatOne = new Cat("Машка", 200, 4, 2);
        Dog DogOne = new Dog("Бим", 500, 10, 0.5F);
        Dog DogTwo = new Dog("Джек", 600, 10, 0.5F);
        Horse HorseOne = new Horse("Пегас", 1500, 100, 3);
        Bird BirdOne = new Bird("Кеша", 5, 0, 0.2F);

        Animal[] arr = {CatOne, DogOne, DogTwo, HorseOne, BirdOne};

        for (int i = 0; i<arr.length; i++) {
            arr[i].run(distanceRun); arr[i].swim(distanceSwim); arr[i].jump(distanceJump);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }
    }

