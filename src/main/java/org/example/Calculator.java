package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        double num,exp;
        int fact_num;
        System.out.println("Welcome to scientific calculator");
        do{
            System.out.println("Which operation would you lke to perform?");
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
                            logger.info("Invalid Input! Closing Application");
                            return;
                        }
                        squareroot(num);
                        break;

                    case 2:
                        System.out.println("Factorial option selected\n");
                        System.out.println("Enter number: ");
                        try{
                            fact_num = scan.nextInt();
                        }
                        catch (InputMismatchException error){
                            System.out.println("Invalid input entered. Please enter integer");
                            // logger
                            logger.info("Invalid Input! Closing Application");
                            return;
                        }
                        factorial(fact_num);
                        break;

                    case 3:
                        System.out.println("Natural Log option selected\n");
                        System.out.println("Enter number: ");
                        try{
                            num = scan.nextDouble();
                        }
                        catch (InputMismatchException error){
                            System.out.println("Invalid input entered.");
                            // logger
                            logger.info("Invalid Input! Closing Application");
                            return;
                        }
                         naturalLog(num);
                        break;

                    case 4:
                        System.out.println("Power option selected\n");
                        System.out.println("Enter number: ");
                        try{
                            num = scan.nextDouble();
                        }
                        catch (InputMismatchException error){
                            System.out.println("Invalid input entered.");
                            // logger
                            logger.info("Invalid Input! Closing Application");
                            return;
                        }
                        System.out.println("Enter exponent");
                        exp = scan.nextDouble();
                        powerF(num,exp);
                        break;

                    default:
                        System.out.println("Enter valid choice. Exiting from application");
                        return;
                }
            }
        }while(true);
    }
    public static double squareroot(Double num){
        double ans = Math.sqrt(num);
        System.out.println("Square root of " + num +" is " + ans);
        //yet to add logger info
        logger.info("SquareRoot calculation");
        return ans;
    }
    public static int factorial(int num){
        int ans = 1;
        if(num<0){
            System.out.println("Number should be positive");
            // logger
            logger.info("Negative Number entered! - in Factorial function");
            return 0;
        }
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        System.out.println("Result is "+ans);
        //logger
        logger.info("Factorial calculation");
        return ans;
    }

    public static double naturalLog(double num){
        double ans = Math.log(num);
        // logger
        logger.info("NaturalLog calculation");
        System.out.println("The result is "+ans);
        return ans;
    }

    public static double powerF(double num,double exp){
        double ans = Math.pow(num,exp);
        System.out.println("The result is "+ans);
        //logger
        logger.info("Power calculation");
        return ans;
    }
}