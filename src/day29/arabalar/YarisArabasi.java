package day29.arabalar;

import day29.arabalar.Araba;

public class YarisArabasi extends Araba {
    public void turbo(){
        System.out.println("Yarış arabası turbo ile uçuyor.");
    }

    @Override
    public void ilerle() {
        System.out.println("Yarış arabası hızla ilerliyor.");
    }
}
