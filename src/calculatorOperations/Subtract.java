package calculatorOperations;

public class Subtract implements Calulate {
    @Override
    public int calculateResult(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }
}
