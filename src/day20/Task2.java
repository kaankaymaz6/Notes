package day20;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Gün isimlerinden ibaret TR-EN sözlük hazırlayınız. Türkçe arama yapılmış ise ingilizcesini, ingilizce arama yapılmış ise Türkçesini ekrana yazdırınız.
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] gunler = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
        System.out.println("Hangi gunu sectiniz? / Which day did you choose? : ");
        System.out.print("Gun / Day : ");
        String gun = new Scanner(System.in).nextLine();
        for (int i = 0; i <= days.length; i++) {
            if (gun.equalsIgnoreCase(days[i])) {
                System.out.println("Secilen gun : " + gunler[i]);
                break;
            } else if (gun.equalsIgnoreCase(gunler[i])) {
                    System.out.println(days[i]);
                    break;
                }
            }
        }
    }
