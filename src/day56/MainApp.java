package day56;

import day55.kafeterya.Urun;

import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Urun> urunler = Urun.stokHazirla();
        //Kaç adet ürünümüz vardır?
        System.out.printf("Toplam %d adet ürün bulunmaktadır.\n",urunler.stream().count());

        //Toplam kaç adet ürün bulunmaktadır?
        int sum=urunler.stream()
                .mapToInt(Urun::miktar).sum();
        System.out.println("Toplam Ürün Adedi : "+sum);

        //Ortalama Ürün fiyatı nedir?
        double ortalama = urunler.stream()
                .mapToDouble(Urun::fiyat).average().getAsDouble();
        System.out.printf("Ortalama Ürün Fiyatı : %5.2f TL\n",ortalama);
    }
}
