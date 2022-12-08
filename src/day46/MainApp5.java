package day46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp5 {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr=new FileReader("src/day46/metin.txt");
            fr.read();
        }catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadı.");
        }catch (IOException e) {
            System.out.println("Dosyadan veri okunamadı.");
        }finally {
            try {
                fr.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Dosya kapatılamadı.");
            }
        }
    }
}
