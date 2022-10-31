package KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, choice, newPassword ;
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanci Adinizi yaziniz: ");
        username = scanner.nextLine();

        System.out.print(" Sifrenizi yaziniz  ");
        password = scanner.nextLine();

        if (password.equals("patika") && username.equals("java") ){
            System.out.println(" ***  Giris yaptiniz **** ");
        }
        else{
            System.out.println("Girilen şifre hatalı, şifrenizi sıfırlamak için yes/no seçiniz...");

            choice = scanner.nextLine();

            if(choice.equals("no")){
                System.out.println(" giris sonlandirildi ");}

            else if (choice.equals("yes")) {
                System.out.println(" yeni sifrenizi yazin ");
                newPassword = scanner.nextLine();

                if(newPassword.equals("java") || newPassword.equals(password)){
                    System.out.println("Hatali giris tekrar dene...");
                }
                else{
                    System.out.println("Şifreniz basariyla yenilendi.");
                }
            }
            else{
                System.out.println("Hatalı seçim yaptınız. ");
            }
        }
    }
}
