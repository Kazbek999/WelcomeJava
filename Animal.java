package Lesson5;

public abstract class Animal {
    private String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;

    Animal(String name, float maxRun, float maxSwim, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }
        String getName() {
        return this.name;
    }
    float getMaxRun() {
        return this.maxRun;
    }
    float getMaxSwim() {
        return this.maxSwim;
    }
    float getMaxJump() {
        return this.maxJump;
    }
    protected void run(float distanceRun) {

        if (maxRun >= distanceRun)
            System.out.println(name + " бежит " + distanceRun + ".");
        else
            System.out.println(name + " не может бежать. Дистанция " + distanceRun + " очень большая.");
    }


    protected void swim(float distanceSwim) {

        if (maxSwim >= distanceSwim)
            System.out.println(name + " плывет " + distanceSwim + ".");
        else
            System.out.println(name + " не может бежать. Дистанция " + distanceSwim + " очень большая.");
    }

    protected void jump(double distanceJump) {

        if (maxJump >= distanceJump)
            System.out.println(name + " прыгает " + distanceJump + ".");
        else
            System.out.println(name + " не может прыгать. Дистанция " + distanceJump + " очень большая.");
    }

}
