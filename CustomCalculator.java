import java.util.Scanner;

public class CustomCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.run();
    }   
}

class Calculator
{
	Scanner sc = new Scanner(System.in);

	public static float divide(float a, float b) throws CannotDivideByZeroException {
        if (b == 0) {
            throw new CannotDivideByZeroException("You can't divide by zero!");
        }
        return a / b;
    }

    public static float multiply(float a, float b) throws MaxMultiplierReachedException {
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplier limit exceeded.");
        }
        return a * b;
    }

    public static float add(float a, float b) throws MaxInputException {
        if (a > 10000 || b > 10000) {
            throw new MaxInputException("Input is too large.");
        }
        return a + b;
    }
    
    public static float sub(float a, float b) throws MaxInputException {
    	if (a > 10000 || b > 10000) {
    		throw new MaxInputException("Input is too large.");
    	}
    	return a - b;
    }
	
	public void run()
	{
		while(true)
		{
			
			System.out.print("Enter the first number: ");
			float num1 = sc.nextFloat();
		
			System.out.print("Enter the operation (+, -, *, /): ");
			char operator = sc.next().charAt(0);

			System.out.print("Enter the second number: ");
			float num2 = sc.nextFloat();
			
			System.out.print("\nThe Result is: ");
			
			switch(operator)
			{
			case '+':
				try {
				    float result = Calculator.add(num1, num2);
				    System.out.println(result);
				} catch (MaxInputException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '-':
				try {
				    float result = Calculator.sub(num1, num2);
				    System.out.println(result);
				} catch (MaxInputException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '*':
				try {
				    float result = Calculator.multiply(num1, num2);
				    System.out.println(result);
				} catch (MaxMultiplierReachedException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '/':
				try {
				    float result = Calculator.divide(num1, num2);
				    System.out.println(result);
				} catch (CannotDivideByZeroException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
            default:
				    System.out.println("Error, enter a valid operation" );
				break;
			}
		
			System.out.println("Current Operation Finished!\n");
		
			System.out.print("Do you want to continue? (yes/no): ");
			String choice = sc.next();
			if (!choice.equalsIgnoreCase("yes")) {
    			System.out.println("Calculator Exited.");
    			break;
			}

			System.out.println("Next Operation Started...\n\n");
			sc.close();
		}
	}
}

class CannotDivideByZeroException extends Exception
{
	public CannotDivideByZeroException(String message)
	{
		super(message);
	}
}

class InvalidInputException extends Exception
{
	public InvalidInputException(String message)
	{
		super(message);
	}
}
class MaxMultiplierReachedException extends Exception
{
	public MaxMultiplierReachedException(String message)
	{
		super(message);
	}
}
class MaxInputException extends Exception
{
	public MaxInputException(String message)
	{
		super(message);
	}
}