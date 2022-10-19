package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            TASK: Klavyeden iki ayrı kareye ait kenar bilgisi girilecektir.
                  Her iki karenin alanını hesaplayan metodu yazınız. Elde edilen sonuçları kıyalayıp
                  hangi karenin alanının büyük olduğunu belirtiniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("First square's side : ");
        int side1= scanner.nextInt();
        System.out.println("Second square's side : ");
        int side2=scanner.nextInt();
        int area1=areaSquare(side1);
        int area2=areaSquare(side2);
        if (area1>area2){
            System.out.println("First sqaure's area is bigger than the second sqaure's area.");
        } else if (area2>area1) {
            System.out.println("Second sqaure's area is bigger than the first sqaure's area.");
        }else {
            System.out.println("Square's areas are same.");
        }
    }
    public static int areaSquare (int sideLenght){
        return sideLenght*sideLenght;
    }
}
