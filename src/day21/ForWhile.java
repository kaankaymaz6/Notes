package day21;

public class ForWhile {
    public static void main(String[] args) {
        String[] names={"Onika","Kikky","Luxanna","Ahri"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);

        int counter=0;
        for (String name:names){
            System.out.println(name);
        }

        double[] numbers={2.3,4.5,8.0};
        double c=0.0;
        for (double n:numbers){
            c+=n;
        }
        System.out.println("Total = "+c);

    }
}
