package enums;

public enum Operands {
    Add,
    Subtract,
    Multiply,
    Divide;

    public static Operands getOperand(Character sign) {
        switch (sign) {
            case '+':
                return Add;
            case '-':
                return Subtract;
            case '*':
                return Multiply;
            case '/':
                return Divide;
        }
        return null;
    }
}