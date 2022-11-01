package UsHesabiYapanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int pow = scanner.nextInt();

        System.out.println("Sonuç: " + calcPow(base, pow));
    }

    private static int calcPow(int base, int pow){
        if (pow != 0) {
            return (base * calcPow(base, pow - 1));
        }
        else{
            return 1;
        }
    }
}
