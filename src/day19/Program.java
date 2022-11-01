package day19;

public class Program {
    public static void main(String[] args) {
        int[] numbers={1,3,5,9,11};     //Her zaman 0'dan başlar! --> 0,1,2,3,4 index var. (Totalde 5 index)
        //YÖNTEM BİR
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//
//        int total=numbers[0]+numbers[1]+numbers[2];
//        System.out.println("Total : "+total);

        //YÖNTEM İKİ
//        for (int i = 0; i < 3; i++) {
//            System.out.print(numbers[i]+"\t");
//        }

        // YÖNTEM ÜÇ
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+"\t");
        }

        // YÖNTEM DÖRT
        System.out.println();   //Alt satıra atması için eklendi.
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i]+"\t");
        }
    }
}
