package day10;

public class Task {
    public static void main(String[] args) {
        /*
            Kenar uzunluğu verilen bir karenin alan hesaplaması yapılacaktır. Bunun için karenin alanını geriye
            döndüren bir method tasarlayınız. Daha sonra bu methodu main methodu içerisinden çağırarak
            iki farklı karenin alanlarını toplayınız. Method ismi alanHesapla olacaktır.
         */
        int a1 = alanHesapla(4);
        int a2 = alanHesapla(6);
        int alanlarToplami = a1+a2;
        System.out.println("Birinci Kare Alani = "+a1);
        System.out.println("Ikinci Kare Alani = "+a2);
        System.out.println("Toplam = " + alanlarToplami);
    }

    public static int alanHesapla(int kenar) {
        return kenar*kenar;

    }
}
