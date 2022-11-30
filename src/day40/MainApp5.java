package day40;

import day20.Arrays;

public class MainApp5 {
    public static void main(String[] args) {
        char[] dizi={'A','L','İ'};
        System.out.println(convertToString(dizi));
        System.out.println();
    }
    public static String convertToString(char[] dizi){
        String str="";
        for (char ch:dizi){
            str+=ch;
        }
        return str;
    }
}
