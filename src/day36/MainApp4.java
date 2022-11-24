package day36;

public class MainApp4 {
    public static void main(String[] args) {
        int x=9;
        System.out.println("x: "+x);
        degistir(x);            //Burada değeri 5 yapmaz çünkü methodun içinde yazılan methodun içinde kalır.
        System.out.println("x: "+x);

        Kitap k1=new Kitap("Suc ve Ceza");

        System.out.println(k1.getAdi());
        degistir(k1);
        System.out.println(k1.getAdi());
    }
    public static void degistir(Kitap kitap){
        kitap.setAdi("Kasagi");
    }
    public static void degistir(int x){
        x=5;

    }
}

class Kitap{
    private String adi;

    public Kitap(String adi) {
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}