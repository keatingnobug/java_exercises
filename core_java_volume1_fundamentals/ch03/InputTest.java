package core_java_volume1_fundamentals.ch03;

import java.util.Scanner;

/*
 * @title $NAME.java
 * @description
 * @author keatingnobug
 * @version 1.0 2023/8/20 22:54
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("How old are you? ");
        int age = input.nextInt();
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
