package intbinary;

public class Minus extends IntBinaryOperation{
    public Minus (int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg - secondArg;

    }

    @Override
    public void say() {

    }
}