package day17;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("KPH\t\t\tMPH");
        for (double i = 60; i <= 130; i += 10) {
            double mil = 0.6214*i;
            System.out.printf("%5.2f\t\t%5.2f",i,mil);
            System.out.println();
        }
    }
}
