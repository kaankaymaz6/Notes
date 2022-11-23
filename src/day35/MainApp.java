package day35;

public class MainApp {
    public static void main(String[] args) {
        //Interface
        /*
            1.Java'da çoklu kalıtım yoktur. Yani bir sınıf sadece bir sınıftan extend edilebilir.
            2.Bir interface kendisini implemente edecek alt sınıflara ne yapacaklarını söyler ama nasıl yapacaklarına
            karışmaz.
            3.
         */

        Kartal kartal1=new Kartal();
        Ucucu ucucu1=new Kirlangic();
        Avci avci1=new Kopekbaligi();

        Ucucu[] ucanlar=new Ucucu[3];
        ucanlar[0]=new Kirlangic();
        ucanlar[1]=new Kartal();
        ucanlar[2]=new Kirlangic();

        for (Ucucu u:ucanlar){
            u.uc();
        }
    }
}
