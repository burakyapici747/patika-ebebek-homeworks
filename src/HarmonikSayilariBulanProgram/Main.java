package HarmonikSayilariBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n sayısını giriniz: ");
        int n = scanner.nextInt();
        double sum = 0;

        for(int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }
        System.out.println("Sonuç: " + sum);
    }
}
