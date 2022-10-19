package day11;

import java.util.Scanner;

public class GuessinGame {
    public static void main(String[] args) {
        int number=21;
        Scanner input = new Scanner(System.in);
        System.out.println("I picked a number.");
        System.out.print("What's your guess?");
        int guess = input.nextInt();
        if (guess<number){
            System.out.println("Choose a higher number.");
        } else if (guess > number) {
            System.out.println("Choose a lower number.");
        }else {
            System.out.println("Condragulations, you won!");
        }
        System.out.println("The game is over.");
    }
}
