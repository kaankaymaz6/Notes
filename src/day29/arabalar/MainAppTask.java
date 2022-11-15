package day29.arabalar;

public class MainAppTask {
    public static void main(String[] args) {
        Araba a1=new Araba();
        YarisArabasi ya1=new YarisArabasi();
        Araba a2=new YarisArabasi();

        a1.ilerle();;
        ya1.ilerle();
        a2.ilerle();
        ya1.turbo();
        ((YarisArabasi)a2).turbo();
    }
}
