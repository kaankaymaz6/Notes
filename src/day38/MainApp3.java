package day38;

public class MainApp3 {
    public static void main(String[] args) {
        String str = "Merhaba";
        //alt alta yazdırma
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        String str2 = "Ey edip adanada pide ye.";
        for (int j = str2.length() - 1; j >= 0; j--) {
            System.out.print(str2.charAt(j));
        }
    }
}

