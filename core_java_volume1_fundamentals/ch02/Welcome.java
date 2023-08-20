package core_java_volume1_fundamentals.ch02;

/*
 * @title $NAME.java
 * @description
 * @author keatingnobug
 * @version 1.0 2023/8/20 22:37
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
        }
        System.out.println();
    }
}