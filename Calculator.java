import java.util.Scanner;
public class Calculator {
    // Functions return type int according to user input 
    static int Addition(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }
    static int Subtraction(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result;
    }
    static int Multiplication(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result;
    }
    static int Division(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        return result;
    }
    public static void main(String[] args) {
        // initialize result variable
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        // Prompt user
        System.out.println("Welcome to the Simple Calculator!\n");
        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit\n");
                System.out.println("Please enter your choice: ");
                int choice = scanner.nextInt();
                //User input is 5 terminate program
                if (choice == 5) {
                    System.out.print("Program Ending...");
                    break;
                }
                // Prompt for first and second numbers
                System.out.println("Enter the first number: ");
                int firstNum = scanner.nextInt();
                System.out.println("Enter the second number: ");
                int secondNum = scanner.nextInt();
                // Input is a number, call specific function
                if (choice == 1) {
                    result = Addition(firstNum, secondNum);
                    System.out.println("Result: " + firstNum + " + " + secondNum + " = " + result);
                } else if (choice == 2) {
                    result = Subtraction(firstNum, secondNum);
                    System.out.println("Result: " + firstNum + " - " + secondNum + " = " + result);
                } else if (choice == 3) {
                    result = Multiplication(firstNum, secondNum);
                    System.out.println("Result: " + firstNum + " * " + secondNum + " = " + result);
                } else if (choice == 4) {
                    if (secondNum == 0) {
                        //If second num is 0 display message and break restart while loop
                        System.out.println("Error: Division by zero. Please enter new values.\n");
                        continue;
                    } else {
                        // If second num is not 0 call function and display
                        result = Division(firstNum, secondNum);
                        System.out.println("Result: " + firstNum + " / " + secondNum + " = " + result);
                    }
                }

                System.out.println("");
            } catch (Exception e) {
                System.out.println("Invalid Input program ending...");
                break;
            }
        }
        // Close the scanner
        scanner.close();
    }
} // End of class