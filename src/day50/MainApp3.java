package day50;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp3 {
    public static void main(String[] args) {
        Kitap k1= new Kitap(1,"Kitap1");
        // System.out.println(k1);

        ArrayList<Kitap> kitapListesi = new ArrayList<>();
        kitapListesi.add(new Kitap(5,"kitap 5"));
        kitapListesi.add(k1);

        kitapListesi.add(new Kitap(3,"Kitap 3"));
        kitapListesi.forEach(k-> System.out.println(k)); // lambda expression

       /* for (var k:kitapListesi) {
            System.out.println(k);

        }

        /Iterator<Kitap> iterator = kitapListesi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
/
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i));

        }

 */
    }
}
