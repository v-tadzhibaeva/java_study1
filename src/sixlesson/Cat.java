package sixlesson;

public class Cat extends Animal {

    public Cat(String name, int canRun, double canJump, int canSwim) {
        super(name, canRun, canJump, canSwim);
    }

    @Override
    public boolean run(int normativeDistance) {
        return ((canRun - normativeDistance) >= 0);
    }

    @Override
    public boolean jump(double normativeJump) {
        return ((canJump - normativeJump) >= 0);
    }

    @Override
    public boolean swim(int normativeSwim) {
        return ((canSwim - normativeSwim) >= 0);
    }
}
