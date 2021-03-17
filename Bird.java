package Lesson5;

public class Bird extends Animal {
    Bird(String name, float maxRun, float maxSwim, float maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }
        @Override
        protected void swim(float distanceSwim) {
            System.out.println(getName() + " плавать не умеет.");
    }
}
