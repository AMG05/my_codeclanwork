public class Calculator {

    public static String myString = "Some value";
    private int runningTotal;

    public Calculator(){
        this.runningTotal = 0;
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public int setRunningTotal(){
        int result = add(1,2);
        return this.runningTotal;
    }


}
