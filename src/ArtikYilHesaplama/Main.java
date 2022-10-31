package ArtikYilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz: ");
        year = scanner.nextInt();

        System.out.println((year % 4 == 0 && year != 100 || year % 400 == 0) ?
                "Girdiğiniz yıl artık yıldır.":"Girdiğiniz yıl artık yıl değildir.");

        scanner.close();
    }
}
