package intbinary;

public class Delenie extends IntBinaryOperation{
    public Delenie(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg / secondArg;

    }

    @Override
    public void say() {

    }
}
