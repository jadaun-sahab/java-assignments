package com.masai;


import java.util.Random;
import java.util.Scanner;

public class vikas {

    public static void main(String[] args) {
    
        Random random = new Random();
        int operand1 = random.nextInt(100);
        int operand2 = random.nextInt(100);
        int correctAnswer = operand1 + operand2;
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve the following math problem:");
        System.out.println(operand1 + " + " + operand2 + " = ?");

        int userAnswer = scanner.nextInt();
 
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}