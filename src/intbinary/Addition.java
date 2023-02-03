package intbinary;

public class Addition extends IntBinaryOperation {

    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return firstArg + secondArg;

    }


    @Override
    public void say() {
        System.out.print("yes");
    }
}
