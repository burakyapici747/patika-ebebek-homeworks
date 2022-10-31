package TaksimetreHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi KM olarak giriniz: ");
        double distance = scanner.nextDouble();

        double calculatedPrice = distance * 2.20 + 10.0;

        double lastPrice = (calculatedPrice < 20) ? 20 : calculatedPrice;

        System.out.println("Ödenecek ücret: " + lastPrice);
    }
}
