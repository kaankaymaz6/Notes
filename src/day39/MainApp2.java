package day39;

public class MainApp2 {
    public static void main(String[] args) {
        //indexof ve substring
        String str="Merhaba kardeş!";
        String substring1 = str.substring(8);
        System.out.println(substring1);
        String substring2 = str.substring(8,14);
        System.out.println(substring2);
        System.out.println(str.substring(8,str.length()));
        System.out.println();

        int indexSpace = str.indexOf(" ");
        System.out.println("Boşluğun index numrası : "+indexSpace);
        int indexExc = str.indexOf("!");
        System.out.println("Ünlem işaretinin index numrası : "+indexExc);

        System.out.println(str.substring(indexSpace+1));
        System.out.println(str.substring(indexSpace+1,indexExc));
        System.out.println();

        String substring3 = str.substring(0,indexSpace);
        System.out.println("Length miktarı : "+substring3.length());
        System.out.println(substring3);
    }
}
