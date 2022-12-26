package day58;

import java.util.Stack;

record Kitap (String adi, double fiyati){}

public class Stacks {
    public static void main(String[] args) {
        /*
            Stack : LIFO, (Last in first out) son giren ilk çıkar.
         */
        Stack<String> kitaplar = new Stack<>();
        System.out.println(kitaplar);
        kitaplar.push("Java 8");
        kitaplar.push("Python");
        //System.out.println(kitaplar.empty());
        if (!kitaplar.empty()) System.out.println(kitaplar);

        System.out.println(kitaplar.peek());
        System.out.println(kitaplar.peek());
        System.out.println(kitaplar.peek());
        System.out.println(kitaplar.peek());
        System.out.println(kitaplar);
        String kitap = kitaplar.pop();
        System.out.println("Pop edilen : " + kitap);
        System.out.println("Liste : " + kitaplar);
        System.out.println(kitaplar.pop());
        System.out.println("Kalan : " + kitaplar);
        System.out.println("---------------------");
        System.out.println(kitaplar.peek());
        System.out.println(kitaplar.pop());

        Kitap kitap1 = new Kitap("Sefiller",10.99);
        Kitap kitap2 = new Kitap("Yüzüklerin Efendisi",12.99);
        Kitap kitap3 = new Kitap("Savaş ve Barış",8.99);

        Stack<Kitap> stack = new Stack<Kitap>();

        stack.push(kitap1);
        stack.push(kitap2);
        stack.push(kitap3);

        System.out.println("Kitap : "+stack.peek());
        System.out.println("Silinen kitap : "+stack.pop());
        System.out.println("Silindikten sonra peek edilen kitap : "+stack.peek());
        System.out.println("Kalan kitaplar : "+stack);
    }
}
