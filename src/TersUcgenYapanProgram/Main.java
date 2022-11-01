package TersUcgenYapanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        int row = scanner.nextInt();


        for(int i = 1; i <= row; i++){


            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= row * 2 - i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
