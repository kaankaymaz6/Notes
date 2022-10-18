package day6;

public class VariableDeclaration {
    public static void main(String[] args) {
        //Dikdörtgenin alan ve çevre hesabını yapan bir Java programı geliştiriniz.
        //Değişken tanımlamalarında Türkçe karakterleri kullanmayınız.
        //Notasyonlar:
        //1. Camel Notasyonu
        //2. Pascal Notasyonu
        //3. Snake Notasyonu

        int kisaKenar=6;
        int uzunKenar=11;
        //Çevre hesabı: 2x (Kısa Kenar + Uzun Kenar)
        //Alan hesabı: Kısa Kenar x Uzun Kenar

        int dikdortgeninCevresi=2 * (kisaKenar+uzunKenar);//statement
        int dikdortgeninAlani=kisaKenar*uzunKenar;

        //Concatenation
        System.out.println("Kisa Kenar : "+kisaKenar);
        System.out.println("Uzun Kenar : "+uzunKenar);
        System.out.println();
        System.out.println("Dikdortgenin Cevresi = "+dikdortgeninCevresi);
        System.out.println("Dikdortgenin Alani = "+dikdortgeninAlani);

    }
}
