/**
 * The program will use a formula to compute future investment value
 * from user input that must include the investment amount,
 * annual interest rate, and the number of years.
 *
 * @ author: Brionna Morris
 * @version: PA01
 * @since: 27 January 2026
 * */

// importing the Scanner class for user input later in program
import java.util.Scanner;
public class ComputeFutureValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //declaring and initializing the investmentAmount with integer type
        int investmentAmount;
        investmentAmount = 0;

        //declaring and initializing the annualInterestRate with double type
        double annualInterestRate;
        annualInterestRate = 0.00;

        //declaring and initializing the numberOfYears with integer type
        int numberOfYears;
        numberOfYears = 0;

        //declaring and initializing the monthlyInterestRate with double type
        double monthlyInterestRate;
        monthlyInterestRate = 0.00;

        //declaring and initializing the futureInvestmentValue with double type
        double futureInvestmentValue;
        futureInvestmentValue = 0.00;

        //Prompts user to input investment amount
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextInt();

        //Prompts user to input annualInterestRate
        System.out.print("Enter annual interest rate: ");
        annualInterestRate = input.nextDouble();

        //Prompts user to input numberOfYears
        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();

        //computing monthly interest rate by 12 months and into a rate instead of percentage
        monthlyInterestRate = annualInterestRate / 12 / 100;

        //computation of futureInvestmentValue based on user input, variables, and provided formula
        futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

        //output will provide user with futureInvestmentValue to the 2nd point (currency)
        System.out.printf("Accumulated value is: %.2f%n", + futureInvestmentValue);
    }
}
