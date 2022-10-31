package KdvTutariniHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ücret giriniz: ");
        double price = scanner.nextDouble();
        double VAT = (price <= 1000) ? 0.18 : 0.8;
        double priceWithVAT = price * VAT + price;
        double priceVAT = price * VAT;

        System.out.println("Uygulanacak Kdv: " + VAT);
        System.out.println("Kdv'li Fiyat: "+ priceWithVAT);
        System.out.println("Kdv Tutarı: "+ priceVAT);
    }
}
