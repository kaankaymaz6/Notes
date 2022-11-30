package day40;

public class MainApp7 {
    public static void main(String[] args) {
        //StringBuilder, StringBuffer
        StringBuilder sb=new StringBuilder("Merhaba!");
        sb.append("Nasılsın?");
        sb.append(5);
        sb.insert(8,"Kardeş");
        System.out.println(sb);
    }
}
