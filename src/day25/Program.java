package day25;

import day25.geometriksekiller.Daire;
import day25.geometriksekiller.Kare;

public class Program {
    public static void main(String[] args) {
        Kare kare1=new Kare();
        kare1.kenar=7;
        //kare1.bilgiGoster();

        Kare kare2=new Kare();
        kare2.kenar=5;
        kare2.bilgiGoster();

        int toplamAlan=kare1.alanHesapla()+kare2.alanHesapla();
        int toplamCevre=kare1.cevreHesapla()+kare2.cevreHesapla();

        Daire d=new Daire();
        //DRY

       //int alan=kare1.kenar* kare1.kenar;
       //System.out.println("Alan ="+alan);
    }
}
