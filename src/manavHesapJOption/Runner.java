package manavHesapJOption;

import static manavHesapJOption.Variables.urunlerMap;

public class Runner {
    static {
        Urun urun0 = new Urun("Domates", 2.10);
        urunlerMap.put(0, urun0);
        Urun urun1 = new Urun("Patates", 3.20);
        urunlerMap.put(1, urun1);
        Urun urun2 = new Urun("Biber", 1.50);
        urunlerMap.put(2, urun2);
        Urun urun3 = new Urun("Soğan", 2.30);
        urunlerMap.put(3, urun3);
        Urun urun4 = new Urun("Havuç", 3.10);
        urunlerMap.put(4, urun4);
        Urun urun5 = new Urun("Elma", 1.20);
        urunlerMap.put(5, urun5);
        Urun urun6 = new Urun("Muz", 1.90);
        urunlerMap.put(6, urun6);
        Urun urun7 = new Urun("Çilek", 6.10);
        urunlerMap.put(7, urun7);
        Urun urun8 = new Urun("Kavun", 4.30);
        urunlerMap.put(8, urun8);
        Urun urun9 = new Urun("Üzüm", 2.70);
        urunlerMap.put(9, urun9);
        Urun urun10 = new Urun("Limon", 0.50);
        urunlerMap.put(10, urun10);
    }

    public static void main(String[] args) {
        new Islemler().anaEkran();
    }
}
