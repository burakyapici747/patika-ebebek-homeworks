package SinifiGecmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math Grade : ");
        double math = scanner.nextDouble();

        System.out.print("Physics Grade : ");
        double physics = scanner.nextDouble();

        System.out.print("Chemical Grade : ");
        double chemical = scanner.nextDouble();

        System.out.print("Language Grade : ");
        double language = scanner.nextDouble();

        System.out.print("History Grade : ");
        double history = scanner.nextDouble();

        System.out.print("Music Grade : ");
        double music = scanner.nextDouble();

        double total = (math + physics + chemical + language + music + history);
        double result = total / 6;
        System.out.println("Average" + result);

        String Situation  = (result >= 60) ? "congratulations you made it ": "Sorry, you failed ";
        System.out.println("Success status: "+Situation);

    }
}
