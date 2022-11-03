package day22;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice=-1;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            choice=new Scanner(System.in).nextInt();
        }while (true);
    }
}
