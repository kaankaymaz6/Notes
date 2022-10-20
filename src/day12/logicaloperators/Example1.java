package day12.logicaloperators;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //Mantıksal operatörler için örnekler

        boolean b=!(4>3);
        //System.out.println(b);

        /*
                Klavyeden girilen üç sayının birbirlerine göre büyüklüklerini test ediniz.
                Ortaya çıkan sonuçları &, |, ^, ve ! ile işleme sokup ekranda gösteriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("First number : ");
        int num1=input.nextInt();
        System.out.print("Second number : ");
        int num2=input.nextInt();
        System.out.print("Third number : ");
        int num3=input.nextInt();

            boolean n1=num1>=num2;
            boolean n2=num2>=num3;
            boolean n3=num1>=num3;

        System.out.println(n1&n2);
        System.out.println(n1&n3);
        System.out.println(n2&n3);

        System.out.println(n1|n2);
        System.out.println(n1|n3);
        System.out.println(n2|n3);

        System.out.println(n1^n2);
        System.out.println(n1^n3);
        System.out.println(n2^n3);

        System.out.println(!(n1));
        System.out.println(!(n2));
        System.out.println(!(n3));
    }
}
