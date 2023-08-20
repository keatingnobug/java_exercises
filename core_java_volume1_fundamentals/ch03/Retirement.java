package core_java_volume1_fundamentals.ch03;

import java.util.Scanner;

/*
 * @title $NAME.java
 * @description
 * @author keatingnobug
 * @version 1.0 2023/8/20 22:57
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money do you need to retire? ");
        double goal = input.nextDouble();
        System.out.println("How much money will you contribute every year? ");
        double payment = input.nextDouble();
        System.out.println("Interest rate in %: ");
        double interestRate = input.nextDouble();
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");
    }
}
