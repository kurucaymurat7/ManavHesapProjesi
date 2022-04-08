package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
        //     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        //     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
        //     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
        //     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        //     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        //     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        //1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.

        List<String> urunList = new ArrayList<>();
        List<Integer> kgList = new ArrayList<>();
        List<Integer> fiyatList = new ArrayList<>();

        System.out.println("Lutfen almak isteginiz urunun kodunu giriniz...");
        System.out.println();
        System.out.println(
                "Ürün\t\tFiyat\t\tÜrün Kodu\n" +
                        "===================================\n" +
                        "Elma\t\t5TL\t\t\t1\n" +
                        "Armut\t\t5TL\t\t\t2\n" +
                        "Portakal\t8TL\t\t\t3\n" +
                        "Mandalina\t8TL\t\t\t4\n" +
                        "Muz\t\t\t15TL\t\t5");

        fiyatList.add(5);
        fiyatList.add(5);
        fiyatList.add(8);
        fiyatList.add(8);
        fiyatList.add(15);

        Scanner scan = new Scanner(System.in);
        int secim = -1;
        int tutar = 0;
        int miktar = 0;

        do {
            System.out.println("Alisverisi bitirmek için lütfen 0' a basiniz...");
            System.out.print("Urun kodu : ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:{
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * fiyatList.get(secim-1);
                    if (!(urunList.contains("Elma"))) {
                        urunList.add("Elma");
                        kgList.add(miktar);
                    } else {
                        for (int i = 0; i < urunList.size(); i++) {
                            if (urunList.get(i) == "Elma") {
                                kgList.set(i, kgList.get(i) + miktar);
                            }
                        }
                    }
                }
                break;
                case 2: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * fiyatList.get(secim-1);
                    if (!(urunList.contains("Armut"))) {
                        urunList.add("Armut");
                        kgList.add(miktar);
                    } else {
                        for (int i = 0; i < urunList.size(); i++) {
                            if (urunList.get(i) == "Armut") {
                                kgList.set(i, kgList.get(i) + miktar);
                            }
                        }
                    }

                    break;
                }
                case 3: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * fiyatList.get(secim-1);
                    if (!(urunList.contains("Portakal"))) {
                        urunList.add("Portakal");
                        kgList.add(miktar);
                    } else {
                        for (int i = 0; i < urunList.size(); i++) {
                            if (urunList.get(i) == "Portakal") {
                                kgList.set(i, kgList.get(i) + miktar);
                            }
                        }
                    }
                }
                break;
                case 4: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * fiyatList.get(secim-1);
                    if (!(urunList.contains("Mandalina"))) {
                        urunList.add("Mandalina");
                        kgList.add(miktar);
                    } else {
                        for (int i = 0; i < urunList.size(); i++) {
                            if (urunList.get(i) == "Mandalina") {
                                kgList.set(i, kgList.get(i) + miktar);
                            }
                        }
                    }
                }
                break;
                case 5: {
                    System.out.print("Kac kg ? ");
                    miktar = scan.nextInt();
                    tutar += miktar * fiyatList.get(secim-1);
                    if (!(urunList.contains("Muz"))) {
                        urunList.add("Muz");
                        kgList.add(miktar);
                    } else {
                        for (int i = 0; i < urunList.size(); i++) {
                            if (urunList.get(i) == "Muz") {
                                kgList.set(i, kgList.get(i) + miktar);
                            }
                        }
                    }
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz. Tekrar deneyin.");
            }
        } while (secim != 0);

        for (int i = 0; i < urunList.size(); i++) {
            System.out.println(urunList.get(i) + " : " + kgList.get(i) + "kg. \t" + fiyatList.get(i) * kgList.get(i) + " TL ");
        }
        System.out.println("Alisveris tutari = " + tutar + " TL. İyi günler");
    }
}
