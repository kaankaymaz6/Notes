package day32;

import day32.personelpro.Personel;

public class MainApp {
    public static void main(String[] args) {
        Personel per1= new Personel() {
            @Override
            public void yonet() {

            }
        };
        per1.setAdi("Ahmet");
        per1.setSoyadi("Dursun");
        per1.setSicilNo(1);
        per1.setIseGirisYili(1990);
        per1.setMaasi(5000);

        per1.iseBasla();
        System.out.println("");
        per1.molaVer();
        System.out.println("");
        per1.paydosYap();

        if (Personel.maasaZamYap(per1,10)) {
            System.out.println("Zam yapıldı.");
        }else {
            System.out.println("Zam yapılmadı.");
        }
        System.out.println("Maaş : "+per1.getMaasi());

        per1=null;
        if (!Personel.maasaZamYap(per1,10)){
            System.out.println("Başarısız.");
        }
    }
}