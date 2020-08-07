package calculatorOperations;

public class Add implements Calulate {
    @Override
    public int calculateResult(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
}
