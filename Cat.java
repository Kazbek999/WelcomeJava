package Lesson5;

public class Cat extends Animal {

    Cat(String name, float maxRun, float maxSwim, float maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }

    @Override
    protected void swim(float distanceSwim) {
        System.out.println(getName() + " плавать не умеет.");
    }
}
