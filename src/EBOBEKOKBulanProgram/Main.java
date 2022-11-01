package EBOBEKOKBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz: ");
        int number1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz: ");
        int number2 = scanner.nextInt();

        int ebob = 0, ekok = 0, min = Math.min(number1, number2), count = 0;

        while(count <= min){
            count++;

            if(number1 % count == 0 && number2 % count == 0){
                ebob = count;
            }

        }
        ekok = (number1 * number2) / ebob;
        System.out.println("EBOB: " + ebob + ", EKOK: " + ekok);

    }
}
