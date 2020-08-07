import Execution.InputDataConditions;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        InputDataConditions.getOutput(input);
        scanner.close();
    }
}
