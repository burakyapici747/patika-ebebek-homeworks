package MukemmelSayilariBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0)
                sum += i;
        }
        if(sum == number){
            System.out.println("Girilen sayı bir mükemmel sayıdır!");
        }else{
            System.out.println("Girilen sayı mükemmel sayı değildir!");
        }

    }
}
