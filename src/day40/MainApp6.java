package day40;

public class MainApp6 {
    public static void main(String[] args) {
        int[] sayilar={1,2,3,4};
        System.out.println(convertToString(sayilar));
    }
    public static String convertToString(int[] values){
        String str="";
        for (int i = 0; i < values.length; i++) {
            str+=values[i];
        }
        return str;
    }
}
