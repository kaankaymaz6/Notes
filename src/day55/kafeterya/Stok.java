package day55.kafeterya;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class Stok extends ArrayList<Urun> {
    private static final Collator TR_LANG=Collator.getInstance(new Locale("tr","TR"));
    public void listele(){
        stream().forEach(urun -> System.out.println(urun));
    }
    public void isimSiraliListele(){
        stream()
                .sorted(Comparator.comparing(Urun::adi,TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }
    public void fiyataGoreListele(){
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).thenComparing(Urun::adi,TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }
}
