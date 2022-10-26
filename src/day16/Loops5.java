package day16;

public class Loops5 {
    public static void main(String[] args) {
        //TODO: 1'den 10'a kadar olan sayıların toplamını bulan java programı yazınız (10 dahil), sonra ortalamasını al.

        int total=0;
        float average=0.0F;
        for (int i = 1; i <= 10 ; i++) {
            total=total+i;

        }
        System.out.println("Total = "+total/10F);
    }
}
