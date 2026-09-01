
class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result = c.add(10, 5);
        System.out.println(result);

    }
}
