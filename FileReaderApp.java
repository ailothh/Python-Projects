package src;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReaderApp {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the input file name (default: input.txt): ");
    String inputFileName = scanner.nextLine().trim();
    if (inputFileName.isEmpty()) {
        inputFileName = "input.txt";
    }
    
    System.out.print("Enter the output file name (default: output.txt): ");
    String outputFileName = scanner.nextLine().trim();
    if (outputFileName.isEmpty()) {
        outputFileName = "output.txt";
    }
    
    try {
        ArrayList<Integer> numbers = readFile(inputFileName);
        if (numbers.isEmpty()) {
            System.out.println("The input file is empty or contains invalid data.");
            return;
        }
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        int max = findMax(numbers);
        
        writeFile(outputFileName, sum, average, max);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Results have been written to " + outputFileName);
        
    } catch (IOException e) {
        System.err.println("An error occurred: " + e.getMessage());
    }
    
    scanner.close();
}

public static ArrayList<Integer> readFile(String fileName) throws IOException {
    ArrayList<Integer> numbers = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(fileName));
    String line;
    while ((line = reader.readLine()) != null) {
        try {
            int number = Integer.parseInt(line);
            numbers.add(number);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in file: " + line);
        }
    }
    reader.close();
    return numbers;
}

public static int calculateSum(ArrayList<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}

public static double calculateAverage(ArrayList<Integer> numbers) {
    int sum = calculateSum(numbers);
    return (double) sum / numbers.size();
}

public static int findMax(ArrayList<Integer> numbers) {
    int max = Integer.MIN_VALUE;
    for (int number : numbers) {
        if (number > max) {
            max = number;
        }
    }
    return max;
}

public static void writeFile(String fileName, int sum, double average, int max) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write("Sum: " + sum + "\n");
    writer.write("Average: " + average + "\n");
    writer.write("Max: " + max + "\n");
    writer.close();
}
}

