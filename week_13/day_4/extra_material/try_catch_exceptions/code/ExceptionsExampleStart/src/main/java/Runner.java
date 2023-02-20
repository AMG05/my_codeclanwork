public class Runner{
    public static void main(String[] args) {
        try {
            int one = 1;
            int zero = 0;
            System.out.println(one / zero);
        }
        catch(ArithmeticException ex){
            System.out.println("ERROR: " +ex.getMessage());
        }

        ExampleTryCatch myProgram = new ExampleTryCatch();
        myProgram.run();
    }
}