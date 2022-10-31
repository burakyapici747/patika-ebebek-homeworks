package ManavKasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        double pearKG = scanner.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double appleKG = scanner.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double tomatoKG = scanner.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double bananaKG = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double eggplantKG = scanner.nextDouble();


        double price = (pearKG * 2.14) + (appleKG * 3.67) + (tomatoKG * 1.11) +
                (bananaKG * 0.95) + (eggplantKG * 5.0);

        System.out.println("Toplam Tutar: " + price + " TL");
    }
}
