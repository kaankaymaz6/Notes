package day30;

import day30.kutuphanepro.Kitap;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        System.out.println("Kitap Giriş Ekranı");
        Scanner input=new Scanner(System.in);
        System.out.print("Kitabın adı : ");
        String adi=input.nextLine();

        System.out.print("Kitabın yazarı : ");
        String yazari=input.nextLine();

        System.out.print("Kitabın sayfa sayısı : ");
        int sayfaAdedi=input.nextInt();

        Kitap kitap=new Kitap();

        kitap.kaydet();
        //kaydet(kitap);
    }
    public static void kaydet(Kitap kitap){
        System.out.println(kitap+" veritabanına kaydedildi.");
    }
}
