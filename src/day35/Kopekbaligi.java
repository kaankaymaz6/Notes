package day35;

public class Kopekbaligi extends Hayvan implements Avci,Yuzucu{
    @Override
    public void avlan() {
        System.out.println("Köpekbalığı avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Köpekbalığı yüzüyor.");
    }
}
