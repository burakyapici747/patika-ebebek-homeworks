package GirilenSayiyaKadarOlanCiftSayilariBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz:");
        number = scanner.nextInt();

        for(int i = 0; i <= number; i++){
            if(i % 2 == 0){
                System.out.print(i + " - ");
            }
        }

        scanner.close();
    }
}
