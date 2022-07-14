import java.util.HashMap;
import java.util.Map;


public class Calculator {

    private final Map<Character, MathOperation> operations = new HashMap<>();

    public void addOperation(char key, MathOperation mathOperations) {
        this.operations.put(key, mathOperations);
    }

    public double calculate(char option, int firstNumber, int secondNumber) {
        for (Character key : this.operations.keySet()) {
            if (key.equals(option)) {
                return this.operations.get(key).calculate(firstNumber, secondNumber);
            }
        }
        throw new RuntimeException("Operation not found:" + option);
    }

}
