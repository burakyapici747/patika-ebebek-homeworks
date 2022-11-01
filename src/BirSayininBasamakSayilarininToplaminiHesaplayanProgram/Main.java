package BirSayininBasamakSayilarininToplaminiHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        String numberAsString = scanner.next();

        int sum = 0;

        for(int i = 0; i < numberAsString.length(); i++){
            sum += Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }
        System.out.println("Girilen " + numberAsString + " sayısının rakamlarının toplamı: " + sum);
    }
}
