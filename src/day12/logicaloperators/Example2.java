package day12.logicaloperators;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        /*
                Verilen bir sayının hem 2'ye hem de 3'e bölünüp bölünmediğini bulan bir Java programı yazınız.
                Durum 1 : Her iki sayıya aynı anda bölünebilme
                Durum 2 : Sadece 2'ye bölünebilme
                Durum 3 : Sadece 3'e bölünebilme
                Durum 4 : Her iki sayıya da bölünememe
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number between 1-100 : ");
        int number = input.nextInt();

        if(number%2==0 & number%3==0){
            System.out.printf("%d, divided by 2 and 3 without a remainder.\n",number);
        } else if (number % 2 == 0) {
            System.out.printf("%d, divided only by 2 without a remainder.\n",number);
        } else if (number % 3 == 0) {
            System.out.printf("%d, divided only by 3 without a remainder.\n",number);
        } else {
            System.out.printf("%d, divided by non without a remainder. \n",number);
        }
    }
}
