import org.example.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }


    @Test
    public void calculatorCanAdd() {
        assertEquals(20, calculator.getAdd());
    }

    @Test
    public void calculatorCanSubtract() {
        assertEquals(25, calculator.getSubtract());
}
