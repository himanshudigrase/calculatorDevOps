package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc  = new Calculator();
        Scanner scan = new Scanner(System.in);
        int choice;
        double num;
        double n1,n2;
        System.out.println("Welcome to scientific calculator");
        do{
            System.out.println("Which operaton would you lke to perform?");
            System.out.println("1.Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit from Calculator");
            System.out.println("Enter your choice: ");


            try{
                choice = scan.nextInt();
            }catch(InputMismatchException error){
                System.out.println("Please enter correct choice.");
                return;
            }
            if(choice == 5){
                System.out.println("Exiting from calculator....");
                return;
            }
            else{
                switch (choice){
                    case 1:
                        System.out.println("Square root option selected\n");
                        System.out.println("Enter number: ");
                        try{
                            num = scan.nextDouble();
                        }catch(InputMismatchException error){
                            System.out.println("Invalid input entered .. please enter number");
                            // Yet to add logger info
                            return;
                        }
                        squareroot(num);
                        break;
                        
                }
            }
        }while(true);



    }
    public static double squareroot(Double num){
        double ans = Math.sqrt(num);
        System.out.println("Square root of " + num +" is " + ans);
        //yet to add logger info
        return ans;
    }
}