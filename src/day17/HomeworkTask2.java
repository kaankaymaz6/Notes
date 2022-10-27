package day17;

public class HomeworkTask2 {
    public static void main(String[] args) {

        //Task 2:
        //0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.

        int total=0;
        for (int i = 1; i <= 20; i++) {
            total=total+i++;

        }System.out.println("Total = "+total);
    }
}
