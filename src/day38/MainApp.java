package day38;

public class MainApp {
    public static void main(String[] args) {
        //Strings
        //Sınıfın adını yazarak oluşturduğumuz methodlara "static" methodlar diyoruz.
        String s = String.valueOf(5);
        System.out.println(s);

        String s1 = ""+5;
        String ahmet = String.format("%s - %d - %5.2f", "Ahmet", 2, Math.PI);
        System.out.println(ahmet);
    }
}
