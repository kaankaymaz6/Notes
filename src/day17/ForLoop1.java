package day17;

public class ForLoop1 {
    public static void main(String[] args) {
        int enterCounter=0; //en baştan başlaması için sıfır
        for (int i = 5; i < 140; i+=2) {
            System.out.print(i+"\t");
            if (++enterCounter%17==0){
                System.out.println();
            }

        }
    }
}
