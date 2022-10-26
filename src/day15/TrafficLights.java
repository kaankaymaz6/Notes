package day15;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a color [R, Y, G] : ");
        String color=input.next();
        color=color.toLowerCase();
        switch (color){
            case "r":
                System.out.print("Red");break;
            case "y":
                System.out.print("Yellow");break;
            case "g":
                System.out.print("Green");break;
        }
    }
}
