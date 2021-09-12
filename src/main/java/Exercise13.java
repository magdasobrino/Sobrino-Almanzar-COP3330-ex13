/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */


import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise13 {

    public static void main(String[] args){

        double principal,interestRate, rate,numOfYears, periodsPerYear,
                exponent, exponential,amountAccrued,base;


        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        principal = input.nextDouble();

        System.out.print("What is the rate? ");
        interestRate = input.nextDouble();
        rate = interestRate / 100;

        System.out.print("What is the number of years? ");
        numOfYears = input.nextDouble();

        System.out.print("What is the number of times the interest is compounded per year? ");
        periodsPerYear = input.nextDouble();

        //A = P(1 + r/n)^(n*t)
          base = (1 + (rate/periodsPerYear));
         exponent = periodsPerYear * numOfYears;
         exponential = Math.pow(base,exponent);
         amountAccrued = principal * exponential;


        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("$" + df.format(principal) +" invested at " + interestRate +"% for " +
                df.format(numOfYears) + " years compounded " + df.format(periodsPerYear)
                + " times per year is $" + df.format(amountAccrued) + ".");
        
    }
}
