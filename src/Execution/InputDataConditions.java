package Execution;

public class InputDataConditions {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;

    public static void getOutput(String input) {
        try {
            String[] values = input.split(" ", 3);

            Calculation calculation = new Calculation(values);

            try {

                if (!values[0].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})|\\d+") || !values[2].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})|\\d+")) {
                    if (values[0].matches("\\d+\\W\\d+") || values[2].matches("\\d+\\W\\d+")) {
                        throw new Exception("Калькулятор умеет работать только с целыми числами");
                    }
                    throw new Exception("Калькулятор принимает на вход числа от I до X включительно");
                }
                if (values[0].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})") && values[2].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})")) {
                    System.out.println(calculation.getRomanResult());
                } else {
                    try {
                        if ((values[0].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})") && (new Integer(values[2]) <= MAX_VALUE || new Integer(values[2]) >= MIN_VALUE))
                                || ((new Integer(values[0]) <= MAX_VALUE || new Integer(values[0]) >= MIN_VALUE) && (values[2].toUpperCase().matches("(X)|(IX|IV|V?I{0,3})")))) {
                            throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.exit(0);
                    }
                    try {
                        if (new Integer(values[0]) > MAX_VALUE || new Integer(values[0]) < MIN_VALUE
                                || new Integer(values[2]) > MAX_VALUE || new Integer(values[2]) < MIN_VALUE) {
                            throw new Exception("Калькулятор принимает на вход числа от 1 до 10 включительно");
                        } else {
                            System.out.println(calculation.getArabicResult());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Неправильно ввели данные!");
            System.exit(0);
        }
    }
}
