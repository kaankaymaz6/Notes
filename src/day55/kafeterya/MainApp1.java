package day55.kafeterya;

public class MainApp1 {
    public static void main(String[] args) {
        Stok stok1=new Stok();
        stok1.addAll(Urun.stokHazirla());
        stok1.listele();
        stok1.isimSiraliListele();
        stok1.fiyataGoreListele();
    }
}
