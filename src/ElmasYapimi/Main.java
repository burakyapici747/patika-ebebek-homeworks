package ElmasYapimi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i <= inputNumber ; i++) {
            for (int j = 0; j < (inputNumber - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int temp = inputNumber;

        for(int i = 1;i < inputNumber; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * temp - 3); z++) {
                System.out.print("*");
            }
            temp--;
            System.out.println(" ");
        }

    }
}
