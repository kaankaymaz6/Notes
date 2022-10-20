package day12.logicaloperators;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TODO: Aşağıdaki Java programını geliştiriniz.
        /*
            Verilen bir sayının 5 ve 2'ye tam bölünüp bölünmediğini bulan Java programını yazınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();
        if (number % 2 == 0 & number % 5 == 0) {
            System.out.printf("%d, divided by 2 and 5 without a remainder.\n", number);
        } else if (number % 2 == 0) {
            System.out.printf("%d, divided only by 2 without a remainder.\n", number);
        } else if (number % 5 == 0) {
            System.out.printf("%d, divided only by 5 without a remainder.\n", number);
        } else {
            System.out.printf("%d, divided by non without a remainder. \n", number);

            //ternary operatörü
        }
    }
}
