package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number=input.nextInt();
        if (number%2==0) {
            System.out.println("Even number!");
        }else{
            System.out.println("Odd number!");
        }
    }
}
