package day16;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first angle : ");
        int a1=input.nextInt();
        System.out.print("Enter the second angle : ");
        int a2=input.nextInt();
        System.out.print("Enter the third angle : ");
        int a3=input.nextInt();
        int triangle=a1+a2+a3;

        if (triangle==180) {
            System.out.println("This is a triangle.");
        }else {
            System.out.println("This is NOT a triangle.");
        }
    }
}
