package day13;

public class RepetitionDay2 {
    public static void main(String[] args) {
        //Öncelik sırası
        //2+28-1+5
        int result1=2+4*7-3/2+5;
        System.out.println(result1);

        //6*4/7
        int result2=(2+4)*(7-3)/(2+5);
        System.out.println(result2);

        //int ile kalan olmaz
        int x1=7/2;
        System.out.println(x1);

        //double da noktalı olarak girilen sayı tam sonucu verir.
        double x2=7.0/2;
        System.out.println(x2);

        //double örnek
        int k=5;
        int m=2;
        double result3=(double) k/m;        //double result=k/(double)m;
        System.out.println(result3);
    }
}
