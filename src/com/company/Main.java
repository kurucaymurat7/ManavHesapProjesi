package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ///*
        //     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
        //     *
        //     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        //     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
        //     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
        //     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        //     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        //     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
        //     *
        //     * */

        //1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.

        System.out.println("Almak isteginizi urunun kodunu giriniz...");
        System.out.println("Elma (1) .. 5TL / Armut (2) .. 5TL / Portakal (3) .. 8TL / " +
                "Mandalina (4) .. 8TL / Muz (5) .. 15TL /  ");

        Scanner scan = new Scanner(System.in);
        int secim = -1;
        int tutar = 0;
        int miktar = 0;

        do {
            System.out.println("Alisverisi bitirmek için lütfen 0' a basiniz...");
            System.out.print("Urun kodu : ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                case 2: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * 5;
                    break;
                }
                case 3:
                case 4: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * 8;
                    break;
                }
                case 5: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * 15;
                    break;
                }
                case 0:
                    break;
            }
        } while (secim != 0);

        System.out.println("Alisveris tutari = " + tutar + " TL. İyi günler");
    }
}
