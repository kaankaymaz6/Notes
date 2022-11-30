package day40;

public class MainApp2 {
    public static void main(String[] args) {
        //contains and replace
        String str="Ben bir garip keloğlanım";
        System.out.println(str);
        //boolean kelVarMi = str.contains("kel");
        boolean kelVarMi=str.toLowerCase().contains("KEL".toLowerCase());
        if (kelVarMi){
            System.out.println("Kel var.");
        }else {
            System.out.println("Kel yok.");
        }

    }
}
