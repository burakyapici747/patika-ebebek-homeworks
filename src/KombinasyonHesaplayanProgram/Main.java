package KombinasyonHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        System.out.println("n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.println("r değerini giriniz: ");
        r = scanner.nextInt();

        double result = (fact(n)) / (fact(r) * fact(n - r));
        System.out.println("n'nin r'li kombinasyonu: " + result);
    }

    private static int fact(int limit){
        int result = 1;
        for(int i = 1;i <= limit; i++){
            result *= i;
        }
        return result;
    }

}
