package day15;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Dört işlem yapabilen hesap makinesi tasarlayınız.
        System.out.println("_".repeat(20));
        System.out.println("|    Operations    |");
        System.out.println("_".repeat(20));
        System.out.println("1. Addition ");
        System.out.println("2. Extraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("-".repeat(20));
        System.out.print("Your choice : ");
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        int answer=Integer.MIN_VALUE;
        String first="First Number : ";
        String second="Second Number : ";
        switch (choice){
            case 1:
                System.out.println("Write the numbers for Addition");
                System.out.print("First Number : ");
                int n1=input.nextInt();
                System.out.print("Second Number : ");
                int n2=input.nextInt();
                answer=n1+n2;
                break;
            case 2:
                System.out.println("Write the numbers for Extraction");
                System.out.print(first);
                n1=input.nextInt();
                System.out.print(second);
                n2=input.nextInt();
                answer=n1-n2;
                break;
            case 3:
                System.out.println("Write the numbers for Multiplication");
                System.out.print(first);
                n1=input.nextInt();
                System.out.print(second);
                n2=input.nextInt();
                answer=n1*n2;
                break;
            case 4:
                System.out.println("Write the numbers for Division");
                System.out.print(first);
                n1=input.nextInt();
                System.out.print(second);
                n2=input.nextInt();
                answer=n1/n2;
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
        if (answer!=Integer.MIN_VALUE)
            System.out.println("Answer = "+answer);
    }
}
