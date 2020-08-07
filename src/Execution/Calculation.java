package Execution;

import calculatorOperations.*;
import conversion.RomanAndArabicNumbersConversion;
import enums.Operands;

public class Calculation {

    private int firstValue;
    private int secondValue;
    private final String firstString;
    private final String secondString;
    private final char operand;

    public Calculation(String[] values) {
        this.firstString = values[0];
        this.operand = values[1].charAt(0);
        this.secondString = values[2];
    }

    private void romanToArabicNumbers(String firstRomanNumber, String secondRomanNumber) {
        this.firstValue = RomanAndArabicNumbersConversion.getRomanNumber(firstRomanNumber);
        this.secondValue = RomanAndArabicNumbersConversion.getRomanNumber(secondRomanNumber);
    }

    private String arabicToRomanNumbers(int arabicToRoman) {
        if (arabicToRoman < 0) {
            arabicToRoman *= -1;
            return "-" + RomanAndArabicNumbersConversion.getArabicNumber(arabicToRoman);
        }
        return RomanAndArabicNumbersConversion.getArabicNumber(arabicToRoman);
    }

    public Calulate getResult() {
        Calulate calulate = null;
        switch (Operands.getOperand(operand)) {
            case Add:
                calulate = new Add();
                break;
            case Subtract:
                calulate = new Subtract();
                break;
            case Multiply:
                calulate = new Multiply();
                break;
            case Divide:
                calulate = new Divide();
                break;
        }
        return calulate;
    }

    public String getRomanResult() {
        Calulate calulate = getResult();
        romanToArabicNumbers(this.firstString.toUpperCase(), this.secondString.toUpperCase());
        int resultInInt = calulate.calculateResult(firstValue, secondValue);
        return arabicToRomanNumbers(resultInInt);
    }

    public int getArabicResult() {
        Calulate calulate = getResult();
        this.firstValue = new Integer(this.firstString);
        this.secondValue = new Integer(this.secondString);
        return calulate.calculateResult(firstValue, secondValue);
    }
}
