package day17;

public class Task1 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        for (int i = 1; i < 100 ; i++) {
            if (i%2==0){
                even=even+i;
            }else{
                odd=odd+i;
            }


            }
        System.out.println("Total of even numbers : "+even);
        System.out.println("Total of odd numbers : "+odd);
        }
    }
