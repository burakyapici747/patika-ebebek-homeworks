package UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner =  new Scanner(System.in);
        final double unitDistanceCharge = 0.1;

        int age, distance, tripType;

        System.out.print("Gideceğiniz mesafeyi(KM) giriniz:");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz:");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz:");
        tripType = scanner.nextInt();

        if(!(age <= 0 || distance <= 0 || (tripType != 1 && tripType != 2))){
            double ageDiscount, normalPrice = 0, totalPrice = 0;

            if(tripType == 1){
                if (age < 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.50;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.10;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age > 65)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.30;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                }
            }else if(tripType == 2){
                double roundTrip = 0, discountedPrice = 0;

                if (age < 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.50;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.10;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age > 65)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.30;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                }
            }
        }else{
            System.out.println("Hatali Veri Girdiniz!");
        }
        scanner.close();
    }
}
