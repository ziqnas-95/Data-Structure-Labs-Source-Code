package StacksQueue_Exercise;

import java.util.Stack;

public class InfixExpressionEvaluator {
    
    // Main method to evaluate infix expression
    public static double evaluate(String expression) {
        // Remove spaces
        expression = expression.replaceAll("\\s+", "");
        
        // Two stacks: one for numbers, one for operators
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // If character is a digit, parse the complete number
            if (Character.isDigit(ch)) {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && 
                       (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--; // Back up one position
                numbers.push(Double.parseDouble(num.toString()));
            }
            
            // If character is opening bracket, push to operators stack
            else if (ch == '(') {
                operators.push(ch);
            }
            
            // If character is closing bracket, solve entire bracket
            else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    double result = performOperation(numbers, operators);
                    numbers.push(result);
                }
                operators.pop(); // Remove the '('
            }
            
            // If character is an operator
            else if (isOperator(ch)) {
                // While top of operator stack has same or greater precedence
                while (!operators.isEmpty() && 
                       precedence(operators.peek()) >= precedence(ch)) {
                    double result = performOperation(numbers, operators);
                    numbers.push(result);
                }
                operators.push(ch);
            }
        }
        
        // Apply remaining operations
        while (!operators.isEmpty()) {
            double result = performOperation(numbers, operators);
            numbers.push(result);
        }
        
        // Final result
        return numbers.pop();
    }
    
    // Check if character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    
    // Return precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    
    // Perform one operation
    private static double performOperation(Stack<Double> numbers, Stack<Character> operators) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Invalid expression");
        }
        
        double b = numbers.pop();
        double a = numbers.pop();
        char operator = operators.pop();
        
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    // Test the evaluator
    public static void main(String[] args) {
        // Test expressions
        String[] expressions = {
            "3 + 5",
            "10 - 4 * 2",
            "(5 + 3) * 2",
            "15 / 3 + 2 * 4",
            "2 + 3 * 4 - 1",
            "(10 + 2) * (5 - 3)",
            "100 / (5 + 5) + 3",
            "2.5 + 3.7 * 2"
        };
        
        System.out.println("Expression Evaluator Results:");
        
        for (String expr : expressions) {
            try {
                double result = evaluate(expr);
                System.out.printf("%-20s = %.2f%n", expr, result);
            } catch (Exception e) {
                System.out.printf("%-20s = Error: %s%n", expr, e.getMessage());
            }
        }
        
        
        // Interactive example
        System.out.println("\nHow it works step by step:");
        System.out.println("Expression: 3 + 5 * 2");
        System.out.println("1. Push 3 to numbers stack");
        System.out.println("2. Push '+' to operators stack");
        System.out.println("3. Push 5 to numbers stack");
        System.out.println("4. '*' has higher precedence than '+', so push '*'");
        System.out.println("5. Push 2 to numbers stack");
        System.out.println("6. End of expression, perform '*': 5 * 2 = 10");
        System.out.println("7. Perform '+': 3 + 10 = 13");
        System.out.println("Result: " + evaluate("3 + 5 * 2"));
    }
}