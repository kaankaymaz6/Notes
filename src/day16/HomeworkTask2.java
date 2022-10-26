package day16;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        System.out.println("_".repeat(20));
        System.out.println("| Area Calculation |");
        System.out.println("_".repeat(20));
        System.out.println("1. Square ");
        System.out.println("2. Circle ");
        System.out.println("-".repeat(20));
        System.out.print("Your choice : ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int sArea = Integer.MIN_VALUE;
        int sPerimeter = Integer.MIN_VALUE;
        int radius = Integer.MIN_VALUE;
        int cArea = Integer.MIN_VALUE;
        int cPerimeter = Integer.MIN_VALUE;
        switch (choice) {
            case 1:
                System.out.println("Enter the info for square");
                System.out.print("Corner : ");
                int corner = input.nextInt();
                sArea = corner * corner;
                System.out.println("Square's Area :"+sArea);
                sPerimeter = corner * 4;
                System.out.println("Square's Perimeter : "+sPerimeter);
                break;
            case 2:
                System.out.println("Enter the info for circle");
                System.out.print("Radius : ");
                radius=input.nextInt();
                cArea = (int) (Math.PI*(radius*radius));
                System.out.println("Circle's Area : "+cArea);
                cPerimeter = (int) (2*Math.PI*radius);
                System.out.println("Circle's Perimeter : "+cPerimeter);
                break;
            default:
                System.out.println("Wrong choice!");
                break;

        }
    }
}