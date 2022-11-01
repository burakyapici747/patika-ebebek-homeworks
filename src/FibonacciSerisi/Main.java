package FibonacciSerisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 1, sum = 0, limit;
        System.out.println("Kaç elemanlı fibonacci listelemek istersiniz?: ");
        limit = scanner.nextInt();
        for(int i = 1; i <= limit; i++){
            sum = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + (sum));
            n1 = n2;
            n2 = sum;
        }
    }
}
