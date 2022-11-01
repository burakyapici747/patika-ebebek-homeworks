package UsluSayiHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        System.out.printf("Üs sayiyi giriniz");
        int exponent = scanner.nextInt();

        System.out.println("Taban sayiyi giriniz");
        int base = scanner.nextInt();

        for(int i = 1; i <= exponent; i++){
            sum *= base;
        }

        System.out.println("Sonuc = " + sum);

    }
}
