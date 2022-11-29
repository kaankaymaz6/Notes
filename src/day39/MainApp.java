package day39;

public class MainApp {
    public static void main(String[] args) {
        //          0 1 2 3 4 5 6 7 8 9 10   11  12  13  14     (Boşlukları da sayıyor)
        //          M e r h a b a   K a  r   d   e   ş   !
        String str="     Merhaba     Kardeş!     ";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println();
        String trimStr = str.trim();            //Sağdan ve soldan boşlukları temizliyor.
        System.out.println(trimStr.length());
        System.out.println(trimStr);
    }
}
