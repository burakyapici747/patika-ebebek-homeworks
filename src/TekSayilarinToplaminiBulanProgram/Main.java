package TekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        do{
            System.out.print("Sayi giriniz:");
            number = scanner.nextInt();

            if(number % 2 == 0 && number % 4 == 0){
                sum += number;
            }

        }while(number % 2 == 0);

        System.out.println("Toplam : " + sum);
        scanner.close();
    }
}
