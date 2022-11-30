package day40;

public class MainApp4 {
    public static void main(String[] args) {
        //empty ve blank
        String str="";
        if (str.isEmpty()){                             //Empty, boşluğu karakterden sayıyor.
            System.out.println("Empty");
        }else {
            System.out.println("Empty değildir.");
        }
        if (str.isBlank()){                             //Blank, boşluğu karakterden saymıyor.
            System.out.println("Blank");
        }else {
            System.out.println("Blank değildir.");
        }
    }
}
