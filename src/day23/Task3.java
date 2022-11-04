package day23;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Task 3: On elemanlı sayilar dizi oluşturunuz. Sonra 0-100 arasındaki rastgele tamsayılarla doldurunuz.
        // Listeleyip, toplamını ve ortalamasını gösteren bir Java programı yazınız.

        Random number = new Random();
        int[] info = new int[10];
        int total = 0;
        for (int i = 0; i < info.length; i++) {
            info[i] = number.nextInt(100);
            System.out.println(info[i]);
            total += info[i];
        }
        System.out.println("Total : " + total);
        System.out.println("Average : " + ((double) total / info.length));
    }
}
