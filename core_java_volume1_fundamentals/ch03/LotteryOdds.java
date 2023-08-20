package core_java_volume1_fundamentals.ch03;

import java.util.Scanner;

/*
 * @title $NAME.java
 * @description
 * @author keatingnobug
 * @version 1.0 2023/8/20 23:16
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k = input.nextInt();
        System.out.println("What is the highest number you can draw? ");
        int n = input.nextInt();
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
