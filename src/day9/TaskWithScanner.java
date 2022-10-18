package day9;

import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /*
        TASK: Klavyeden girilen iki sayının çarpımını bulup, ekrana yazan bir Java programı tasarlayınız.
         */

        Scanner klavyeGirdisi=new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int sayi1 = klavyeGirdisi.nextInt();
        System.out.print("Ikinci Sayi : ");
        int sayi2 = klavyeGirdisi.nextInt();
        int carpim=sayi1*sayi2;
        System.out.println("Girilen sayilarin carpimi = "+carpim);
    }
}
