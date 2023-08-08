package com.masai;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	import java.util.Random;
	import java.util.Scanner;

	@SpringBootApplication
	public class MathProblemApplication {

	    public static void main(String[] args) {
	        SpringApplication.run(MathProblemApplication.class, args);

	        // Define the list of math operations
	        String[] operations = {"+", "-", "*", "/"};

	        // Generate a random math problem
	        Random random = new Random();
	        int operand1 = random.nextInt(100);
	        int operand2 = random.nextInt(100);
	        String operation = operations[random.nextInt(operations.length)];
	        String problem = operand1 + " " + operation + " " + operand2 + " = ?";

	        // Ask the user for an answer
	        Scanner scanner = new Scanner(System.in);
	        int answer = 0;
	        while (true) {
	            System.out.println(problem);
	            try {
	                answer = scanner.nextInt();
	                break;
	            } catch (Exception e) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.nextLine(); // clear the input buffer
	            }
	        }

	        // Check if the answer is correct
	        int result = 0;
	        switch (operation) {
	            case "+":
	                result = operand1 + operand2;
	                break;
	            case "-":
	                result = operand1 - operand2;
	                break;
	            case "*":
	                result = operand1 * operand2;
	                break;
	            case "/":
	                result = operand1 / operand2;
	                break;
	        }
	        if (answer == result) {
	            System.out.println("Congratulations! Your answer is correct.");
	        } else {
	            System.out.println("Sorry, your answer is incorrect. Please try again.");
	            main(args); // ask another question
	        }
	    }

	}
