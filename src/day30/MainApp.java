package day30;

import day30.kutuphanepro.Kitap;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Encapsulation: Pkaetleme, sarmalama.
        /*
            public: Her yerden erişim sağlanır.
            protected: Aynı package veya (alt sınıf başka packageta olsa bile) atası olduğu alt sınıflardan erişim sağlanır.
            <default> (bir şey yazmayınca): Aynı package içerisinden erişim sağlanır.
            private: Sadece sınıf içerisinden erişim sağlanır.
         */
        Kitap kitap=new Kitap();

        System.out.println("Kitap Giriş Ekranı");
        Scanner input=new Scanner(System.in);
        System.out.print("Kitabın adı : ");
        kitap.setAdi(input.nextLine());

        System.out.print("Kitabın yazarı : ");
        kitap.setYazari(input.nextLine());

        System.out.print("Kitabın sayfa sayısı : ");
        kitap.setSayfaAdedi(input.nextInt());
        kaydet(kitap);
    }
    public static void kaydet(Kitap kitap){
        System.out.println(kitap+" veri tabanına kaydedildi.");
    }
}
