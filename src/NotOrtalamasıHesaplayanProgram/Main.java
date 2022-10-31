package NotOrtalamasıHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        int math = scanner.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        int physics = scanner.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        int chemical = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        int turkish = scanner.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        int history = scanner.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        int music = scanner.nextInt();

        double average = (math + physics + chemical + turkish + history + music) / 5;

        System.out.println(average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        scanner.close();
    }
}
