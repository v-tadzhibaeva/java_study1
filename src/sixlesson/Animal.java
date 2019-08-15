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

    @Override
    public boolean run(int normativeRun) {
        return ((canRun - normativeRun) >= 0);
    }

    @Override
    public boolean jump(double normativeJump) {
        return ((canJump - normativeJump) >= 0);
    }

    @Override
    public boolean swim(int normativeSwim) {
        return ((canSwim - normativeSwim) >= 0);
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
