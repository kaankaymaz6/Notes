package day39;

import java.util.Arrays;

public class MainApp6 {
    public static void main(String[] args) {
        /*
            TASK:
            1. Verilen bir metindeki kelime sayısını döndüren metodu yazınız. (countWords)
            2. Örnek bir metnin kelimelerini saydırıp, ekrana yazdırınız.
         */
        String str="Buraya ne yazacağımı bilemedim.";
        String[] kelimeler = str.split(" ");
        System.out.println(kelimeler.length);
        countWords(kelimeler);
    }
    public static int countWords(String[] kelimeler){
        return kelimeler.length;
    }
}
