package day22;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
/*        System.out.print("Sentence : ");
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){            //has.Next kelimelere ayırmaya yaradı.
            System.out.println(input.next());
        }*/

        String sentence="Video gives you an option to prove yourself.";

        Scanner input=new Scanner(sentence);
        while (input.hasNext()){
            System.out.println(input.next());
        }
    }
}
