package day34;

public class MainApp {
    public static void main(String[] args) {
        // Jagged Diziler : eleman sayıları farklı olan dizilerin dizisidir.
        // int [][] notlar= new int [5][3]; - matris

        //String[][] zaman=new String[3][];
//      //Haftanın Günleri
//      zaman[0]=new String[7];
//      zaman[0][0]="Pazartesi";
//      zaman[0][1]="Salı";
//      zaman[0][2]="Çarşamba";
//      zaman[0][3]="Perşembe";
//      zaman[0][4]="Cuma";
//      zaman[0][5]="Cumartesi";
//      zaman[0][6]="Pazar";
//
//      //Yılın Ayları
//      zaman[1]=new String[12];
//      zaman[1][0]="Ocak";
//      zaman[1][1]="Şubat";
//      zaman[1][2]="Mart";
//      zaman[1][3]="Nisan";
//      zaman[1][4]="Mayıs";
//      zaman[1][5]="Haziran";
//      zaman[1][6]="Temmuz";
//      zaman[1][7]="Ağustos";
//      zaman[1][8]="Eylül";
//      zaman[1][9]="Ekim";
//      zaman[1][10]="Kasım";
//      zaman[1][11]="Aralık";
//
//      //Mevsimler
//      zaman[2]=new String[4];
//      zaman[2][0]="Kış";
//      zaman[2][1]="İlkbahar";
//      zaman[2][2]="Yaz";
//      zaman[2][3]="Sonbahar";

        String[][] zaman = {
                {"Pzt", "Sal", "Çar", "Per", "Cum", "Cmt", "Paz"},
                {"Oca", "Şub", "Mart", "Nis", "May", "Haz", "Tem", "Ağu", "Eyl", "Ekim", "Kas", "Ara"},
                {"İlkbahar", "Yaz", "Sonbahar", "Kış"},
        };
        System.out.println(zaman.length);
        System.out.println("ilk eleman : " + zaman[0].length + "elemanıdır .");
        System.out.println("ikinci eleman : " + zaman[1].length + "elemanıdır .");
        System.out.println("üçüncü eleman : " + zaman[2].length + "elemanıdır .");

        int toplamElemanSayisi = 0;

        for (int i = 0; i < zaman.length; i++) {
            toplamElemanSayisi = zaman[i].length;
        }
        System.out.println("toplam eleman sayısı: " + toplamElemanSayisi);
        for (int i = 0; i < zaman.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(zaman[i][j] + "\t");

            }
            System.out.println();
        }
    }
}

