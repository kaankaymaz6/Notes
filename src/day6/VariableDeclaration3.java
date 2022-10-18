package day6;

public class VariableDeclaration3 {
    public static void main(String[] args) {
        /* -----Veri Tipleri-----
                1. İlkel Tipler - Pirimitive Types
                2. Referans Tipler - Reference Types
         */


        //Tamsayı veri tipleri
        //int sayiMax=2_147_483_647;
        //int sayiMin=-2_147_483_648;
//        int sayiMax=Integer.MAX_VALUE;
//        int sayiMin=Integer.MIN_VALUE;

//        System.out.println(sayiMax);
//        System.out.println(sayiMin);

        //byte, short, long

        byte sayiMax1=Byte.MAX_VALUE;
        byte sayiMin1=Byte.MIN_VALUE;
        System.out.println("Max Byte : "+sayiMax1);
        System.out.println("Min Byte : "+sayiMin1);

        short sayiMax2=Short.MAX_VALUE;
        short sayiMin2=Short.MIN_VALUE;
        System.out.println("Max Short : "+sayiMax2);
        System.out.println("Mix Short : "+sayiMin2);

        long sayiMax3=Long.MAX_VALUE;
        long sayiMin3=Long.MIN_VALUE;
        System.out.println("Max Long : "+sayiMax3);
        System.out.println("Min Long : "+sayiMin3);
    }
}
