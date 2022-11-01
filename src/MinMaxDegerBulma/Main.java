package MinMaxDegerBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz");

        int inputNumber = scanner.nextInt();
        int[] inputNumbers = new int[inputNumber];

        for(int i = 0; i < inputNumber; i++){
            System.out.println("Lütfen Sayi Giriniz!");
            inputNumbers[i] = scanner.nextInt();
        }
        int minValue = inputNumbers[0], maxValue = inputNumbers[0];

        for(int i = 0; i < inputNumbers.length; i++){
            if(minValue > inputNumbers[i]){
                minValue = inputNumbers[i];
            }
            if(maxValue < inputNumbers[i]){
                maxValue = inputNumbers[i];
            }
        }

        System.out.println("Max value = " + maxValue);
        System.out.println("Min value = " + minValue);


    }
}
