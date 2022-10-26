package day15;

import java.util.Scanner;

public class Task2Ternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String answer=number%2==0?"Even number":"Odd number";
        System.out.println(answer);
    }
}
