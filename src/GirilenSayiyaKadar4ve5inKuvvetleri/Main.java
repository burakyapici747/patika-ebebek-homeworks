package GirilenSayiyaKadar4ve5inKuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Lütfen bir sayi giriniz!");
        int inputNumber = scanner.nextInt();
        for(int i = 1; i <= inputNumber; i++){
            if(i%4 == 0 || i%5 == 0){
                System.out.println(i*i);
            }
        }

    }
}
