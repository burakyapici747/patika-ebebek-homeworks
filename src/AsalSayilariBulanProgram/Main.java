package AsalSayilariBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        for(int i = 2; i <= 100; i++){

            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int number){
        boolean result = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }

        return result;
    }
}
