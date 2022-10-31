package VucutKitleIndeksiHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boy(Metre) giriniz: ");
        double height = scanner.nextDouble();

        System.out.print("Kilo giriniz: ");
        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}
