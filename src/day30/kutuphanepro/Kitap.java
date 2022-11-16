package day30.kutuphanepro;

public class Kitap {
    private boolean gecerliMi=true;
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    //getterların bir dönüş tipi var. Setterların dönüş tipi yok yani(void)
    //private üyelere erişmek için public yöntemler geliştiriyoruz yani getter setterlar metodlara benzer.

    public Kitap(){
    }

    public Kitap(String adi, String yazari, int sayfaSayisi) {
        setAdi(adi);
        setYazari(yazari);
        setSayfaAdedi(sayfaSayisi);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        if (adi!=null&!adi.isEmpty()&!adi.isBlank()) {
            this.adi = adi;
        }else {
            gecerliMi=false;
            System.err.println("Kitap adı boş olamaz.");
        }
    }

    public String getYazari(String s) {
        return yazari;
    }

    public void setYazari(String yazari) {
        if (yazari!=null&!yazari.isEmpty()&!yazari.isBlank()) {
            this.yazari = yazari;
        }else {
            gecerliMi=false;
            System.err.println("Yazarı boş olamaz.");
        }    }

    public int getSayfaAdedi(int i) {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaSayisi) {
        if (sayfaSayisi > 0) {
            this.sayfaAdedi = sayfaSayisi;
        }else {
            gecerliMi=false;
            System.err.println("Sayfa sayısı negatif olamaz.");

        }
    }

    public void kaydet(){
        if (gecerliMi) {
            System.out.println(this + " veri tabanına kaydedildi.");
        }else {
            System.out.println("Kayıt işlemi başarısız.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s(%s: %d)",adi,yazari,sayfaAdedi);

    }
}