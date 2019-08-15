package sixlesson;

public class Dog extends Animal {

    public Dog(String name, int canRun, double canJump, int canSwim) {
        super(name, canRun, canJump, canSwim);
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
}
