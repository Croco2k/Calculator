package calculatorOperations;

public class Multiply implements Calulate {
    @Override
    public int calculateResult(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
}