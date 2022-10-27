package day17;

public class HomeworkTask3 {
    public static void main(String[] args) {

        //Task 3:
        //0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yüz dahil)

        for (int i = 10; i <= 100; i++) {

            if (i%10==0) {
                System.out.print(" "+i);
            }

        }
    }
}
