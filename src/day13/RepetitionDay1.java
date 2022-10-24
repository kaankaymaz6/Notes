package day13;

public class RepetitionDay1 {
    public static void main(String[] args) {
        /*
            Osman Durmuş eski bir milletvekiliydi. Şuan 59 yaşındadır.
            Kamer Genç eski bir milletvekiliydi, Şuan 70 yaşındadır.
         */
        String osmanIsim="Osman Durmus";
        int osmanYas=59;

        String kamerIsim="Kamer Genc";
        int kamerYas=70;

        String mesaj=String.format("%s eski bir milletvekilidir. Suan %d yasindadir.",osmanIsim,osmanYas);
        System.out.println(mesaj);

        mesaj=String.format("%s eski bir milletvekilidir. Suan %d yasindadir.",kamerIsim,kamerYas);
        System.out.println(mesaj);
    }
}
