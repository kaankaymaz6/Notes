package day23;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Task 2: Beş elemanlı arabalar dizisi oluşturunuz. Kullanıcıdan bir aradığı arabanın ismini isteyiniz.
        // Bulunca "aradığınız araç bulundu" veya "Araç bulunamadı" mesajı veren Java programı yazınız.

        String[] cars = {"BMW", "Mercedes", "Maybach", "Lamborgini", "Royce"};
        System.out.print("Which car do you want? : ");
        String input = new Scanner(System.in).nextLine();
        boolean not = true;
        for (String car : cars) {
            if (input.equalsIgnoreCase(car)) {
                System.out.println("The car you wanted is available.");
                not = false;
                break;
            }
        }
        if (not) {
            System.out.println("The car you wanted is NOT available.");
        }
    }
}
