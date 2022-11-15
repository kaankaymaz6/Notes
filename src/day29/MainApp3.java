package day29;

public class MainApp3 {
    public static void main(String[] args) {
        Hayvan hy=new Kedi();
        Kedi k=(Kedi) hy;                   //Devamında sürekli "k." şeklinde kullanamamızı sağlıyor.
        ((Kedi)hy).avlan();                 //Tek seferlik yöntem (sadece "avlan" için.
    }
}
