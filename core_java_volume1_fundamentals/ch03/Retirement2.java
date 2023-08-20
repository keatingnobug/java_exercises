package core_java_volume1_fundamentals.ch03;

import java.util.Scanner;

/*
 * @title $NAME.java
 * @description
 * @author keatingnobug
 * @version 1.0 2023/8/20 23:02
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money will you contribute every year? ");
        double payment = input.nextDouble();
        System.out.println("Interest rate in %: ");
        double interestRate = input.nextDouble();
        double balance = 0;
        int years = 0;
        String in;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
            System.out.println("Ready to retire? (Y/N) ");
            in = input.next();
        } while (in.equals("N"));
    }
}
