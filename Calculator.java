import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Number 1: ");

        num1 = input.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");
        char operator = input.next().charAt(0);

        System.out.println("Number 2:");
        num2 = input.nextDouble();

        double result; 
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                result = num1 / num2;
                break;        
                
                default: 
                System.out.println("invalid Operator");
                return;
        }
        System.out.println(result); 
    }
}