package PalindromSayilariBulanProgram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        original = scanner.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Palindrom Sayı");
        else
            System.out.println("Palindrom Sayı Değil");
    }
}
