public class Runner {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        int result = Calculator.add(1, 2);

        String.format("My value is %d", result);
        System.out.println(result);
    }
}
