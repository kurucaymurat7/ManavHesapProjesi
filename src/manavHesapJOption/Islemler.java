package manavHesapJOption;

import java.util.Map;
import java.util.Set;

import static manavHesapJOption.Variables.*;

public class Islemler implements IslemlerInterface {

    static String secim;
    static double toplamtutar = 0;

    public void anaEkran() {

        do {
            secim = jOptionPane.showInputDialog(null,
                    "Hoş Geldiniz...\n" +
                            "Ürün Listele (1) \n" +
                            "Ürün Seç Satın Al (2) \n" +
                            "Sepeti Yazdir  (3) \n" +
                            "Ödeme Yap (4) \n" +
                            "Cikis (0)");
            switch (secim) {
                case "1": {
                    urunListele();
                    break;
                }
                case "2": {
                    urunSecSatinAl();
                    break;
                }
                case "3": {
                    sepetiYazdir();
                    break;
                }
                case "4": {
                    odemeYap();
                    break;
                }
                case "0": {
                    System.exit(0);
                }
                default:
                    jOptionPane.showMessageDialog(null, "Hatalı giriş yaptınız. Tekrar deneyiniz.");
            }
        } while (!secim.equalsIgnoreCase("0"));
    }

    @Override
    public void urunSecSatinAl() {
        String secim = "";
        double miktar = 0;
        do {
            secim = jOptionPane.showInputDialog(null,
                    "No \t   Ürün \t\t  Fiyat\n" +
                            "\t\t\t\t==============================\n" +
                            "\t\t\t\t\t0\t Domates   \t \t 2.10 TL\n" +
                            "\t\t\t\t\t1\t Patates   \t \t 3.20 TL\n" +
                            "\t\t\t\t\t2\t Biber     \t \t 1.50 TL\n" +
                            "\t\t\t\t\t3\t Soğan      \t 2.30 TL\n" +
                            "\t\t\t\t\t4\t Havuç     \t   \t 3.10 TL\n" +
                            "\t\t\t\t\t5\t Elma      \t   \t 1.20 TL\n" +
                            "\t\t\t\t\t6\t Muz     \t \t 1.90 TL\n" +
                            "\t\t\t\t\t7\t Çilek \t \t\t 6.10 TL\n" +
                            "\t\t\t\t\t8\t Kavun      \t 4.30 TL\n" +
                            "\t\t\t\t\t9\t Üzüm      \t \t 2.70 TL\n" +
                            "\t\t\t\t\t10\t Limon     \t \t 0.50 TL \n" +
                            "Lütden bir ürün seçiniz \n" +
                            "Geri dönmek için Q'ya basınız...");

            if (!(secim.equalsIgnoreCase("Q"))) {

                int secimInt = Integer.valueOf(secim);

                miktar = Double.parseDouble(jOptionPane.showInputDialog(null, urunlerMap.get(secimInt).getUrunAdi() + " miktar giriniz: "));

                String urunAdi = urunlerMap.get(secimInt).getUrunAdi();
                double urunfiyati = urunlerMap.get(secimInt).getFiyati();

                if (sepetMap.containsKey(secimInt)) {
                    sepetMap.get(secimInt).setMiktar(sepetMap.get(secimInt).getMiktar() + miktar);
                    sepetMap.get(secimInt).setTutar(sepetMap.get(secimInt).getTutar() + (miktar * urunfiyati));
                } else {
                    Urun yeniUrun = new Urun(urunAdi, urunfiyati, miktar, (miktar * urunfiyati));
                    sepetMap.put(secimInt, yeniUrun);
                }
                jOptionPane.showMessageDialog(null, sepetMap.get(secimInt).getMiktar() + " kg. " + urunlerMap.get(secimInt).getUrunAdi() + " sepette mevcut");
            } else
                anaEkran();
        } while (true);
    }

    @Override
    public void urunListele() {
        Set<Map.Entry<Integer, Urun>> urunlerEntrySet = urunlerMap.entrySet();
        String urunlerString = "";

        for (Map.Entry<Integer, Urun> each : urunlerEntrySet) {
            urunlerString += "Ürün adi : " + each.getValue().getUrunAdi() +
                    ", Ürün fiyati : " + each.getValue().getFiyati() + "\n";
        }
        jOptionPane.showMessageDialog(null, urunlerString);
    }

    @Override
    public void sepetiYazdir() {
        Set<Map.Entry<Integer, Urun>> sepeturunlerEntrySet = sepetMap.entrySet();

        for (Map.Entry<Integer, Urun> each : sepetMap.entrySet()) {
            toplamtutar += (float)each.getValue().getTutar();
        }

        String sepetString = "";
        for (Map.Entry<Integer, Urun> each : sepeturunlerEntrySet) {
            sepetString += "Ürün adi : " + each.getValue().getUrunAdi() +
                    ", Tutarı : " + each.getValue().getTutar() + "\n";
        }

        sepetString += "\n Toplam tutar : " + toplamtutar;

        jOptionPane.showMessageDialog(null, sepetString);
    }

    @Override
    public void odemeYap() {
        double odenenPara = Double.parseDouble(jOptionPane.showInputDialog(null, "Sepet tutarı : " + toplamtutar + " TL. \n Miktar giriniz: "));
        if (odenenPara > toplamtutar) {
            double paraustu = odenenPara - toplamtutar;
            jOptionPane.showMessageDialog(null, "Para üstü: " + paraustu + " TL ");
            toplamtutar = 0;
            anaEkran();
        } else {
            jOptionPane.showMessageDialog(null, "Eksik girdiniz. Tekrar deneyiniz.");
            odemeYap();
        }
    }

    @Override
    public void cikis() {
        jOptionPane.showMessageDialog(null, "Çıkış yapılıyor...");
        System.exit(1);
    }
}
