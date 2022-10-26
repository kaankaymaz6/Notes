package day16;

public class Loops1 {
    public static void main(String[] args) {
        /*
            Loops:
            for,
            while,
            do... while,
            for-each
         */

        //FOR
        //for(başlangıç_değeri;şart;artış_miktarı){
        //
        //}

        //Değişkenin değeri nasıl arttırılır?
        int x=5;
        //x=x+1;
        //x+=1;
        //x++; suffix - postfix
        //++x; prefix           (Tek başına kullanıldıklarında hiçbir farkları yoktur.)

//        int y=1;
//        int z=x++ + ++y;
//        System.out.println("x= "+x);
//        System.out.println("y= "+y);
//        System.out.println("z= "+z);

        for (int i=0;i<5;i++){
            System.out.println("i = "+i);
        }
    }
}
