package maluevArtem;

public class Main {

    public static void main(String[] args) {

        Ints intsCalculator = new IntsCalculator(new Calculator());
        System.out.println(intsCalculator.sum(5, 2));
        System.out.println(intsCalculator.mult(10, 10));
        System.out.println(intsCalculator.pow(4, 4));

    }
}
