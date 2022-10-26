package day16;

import java.util.Scanner;

public class HomeworkTask1Ternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int a1 = input.nextInt();
        System.out.print("Enter second angle: ");
        int a2 = input.nextInt();
        System.out.print("Enter third angle: ");
        int a3 = input.nextInt();
        String answer=(a1+a2+a3==180)?"Its a triangle":"Its not a triangle";
        System.out.println(answer);
    }
}
