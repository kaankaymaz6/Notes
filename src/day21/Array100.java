package day21;

public class Array100 {
    public static void main(String[] args) {
        int[] numbers={40,50,10,20,70};
        //System.out.println(numbers[4]); --> 4.index'i yani 5.elemanı gösterir.
        int wanted=10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==wanted) {
                System.out.println("Wanted number is found. No : "+(i+1));
            }
        }
    }
}
