package day33.Array20;

public class MainApp3 {
    public static void main(String[] args) {
        //int[][][] notlar=new int[3][3][2];
        int[][][] notlar={
                {//Ahmet
                        //V F
                        {46,68},//Fizik
                        {74,79},//Kimya
                        {93,98}//Mat
                },
                {//Ayşe
                        //V F
                        {32,62},//Fizik
                        {37,59},//Kimya
                        {63,35}//Mat
                },
                {//Şengül
                        //V F
                        {84,40},//Fizik
                        {90,37},//Kimya
                        {73,79}//Mat
                },
                {//Orhan
                        //V F
                        {81,41},//Fizik
                        {49,49},//Kimya
                        {32,41}//Mat
                },
                {//Betül
                        //V F
                        {87,87},//Fizik
                        {43,41},//Kimya
                        {42,68}//Mat
                }
        };
        String[] isimler={"Ahmet","Ayşe","Şengül","Orhan","Betül"};
        System.out.println("\t\tFIZ\t\t\tKIM\t\t\tMAT");
        System.out.printf("Adı\t\t"+"Viz\tFin\t\t".repeat(3)+"\n");
        for (int i = 0; i < notlar.length; i++) {
            System.out.print(isimler[i]+"\t");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(notlar[i][j][k]+"\t");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
