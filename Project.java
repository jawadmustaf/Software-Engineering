// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Call the add method from the Calculator class
        int result = calculator.add(5, 10);
        System.out.println("Result: " + result);
    }
}

// Calculator class
 class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
