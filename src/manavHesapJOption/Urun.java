package manavHesapJOption;

import java.util.Map;
import java.util.TreeMap;

public class Urun {
    private String urunAdi;
    private double fiyati;
    private double miktar;
    private double tutar;


    public Urun() {
    }

    public Urun(String urunAdi, double fiyati, double miktar, double tutar) {
        this.urunAdi = urunAdi;
        this.fiyati = fiyati;
        this.miktar = miktar;
        this.tutar = tutar;
    }

    public Urun(String urunAdi, double fiyati) {
        this.urunAdi = urunAdi;
        this.fiyati = fiyati;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunAdi='" + urunAdi + '\'' +
                ", fiyati=" + fiyati +
                ", miktar=" + miktar +
                ", tutar=" + tutar +
                '}';
    }
}
