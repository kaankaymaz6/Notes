package day46;


import java.io.File;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String fileName="src/day46/task.txt";
        File file=new File(fileName);
        if (!file.exists()){
            System.err.println("Dosya bulunamadı.");
            return;
        }
        System.out.printf("Silinecek dosya: %s\n",file.getName());
        System.out.print("Silmek ister misiniz? [e/h] : ");
        Scanner input=new Scanner(System.in);
        String cevap = input.nextLine();
        cevap=cevap.toLowerCase();
        boolean sonuc = cevap.equals("e") | cevap.equals("evet") ? file.delete() : false;
        if (sonuc){
            System.out.println("Dosya başarılı şekilde silindi.");
        }else {
            System.err.println("Dosya silinmedi.");
        }
    }
}