package intbinary;

public class ExitPoint {
    public static void main(String[] args) {
        IntBinaryOperation add = new Addition(4, 5);
        System.out.print(add.perform());

        IntBinaryOperation add2 = new Multiplication(6, 6);
        System.out.print(add2.perform());

        IntBinaryOperation add3 = new Multiplication(9, 3);
        System.out.print(add3.perform());

        IntBinaryOperation add4 = new Multiplication(4, 2);
        System.out.print(add4.perform());
    }
}
