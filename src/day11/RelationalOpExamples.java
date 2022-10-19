package day11;

import java.util.Scanner;

public class RelationalOpExamples {
    public static void main(String[] args) {
        /*
            Klavyeden yaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen
            Java programını yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Your age : ");
        int age=input.nextInt();
        if (age>=18) {
            System.out.println("You are an adult.");
        }

        else {
            System.out.println("You are not an adult.");
        }
    }
}
