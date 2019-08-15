package sixlesson;

public abstract class Animal implements Run, Jump, Swim {
    private String name;
    protected int canRun;
    protected double canJump;
    protected int canSwim;

    public Animal(String name, int canRun, double canJump, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public int getCanRun() {
        return canRun;
    }

    public double getCanJump() {
        return canJump;
    }

    public int getCanSwim() {
        return canSwim;
    }
}
