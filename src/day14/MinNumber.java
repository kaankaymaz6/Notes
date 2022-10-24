package day14;

public class MinNumber {
    public static void main(String[] args) {
        int n1=6;
        int n2=2;
        int n3=4;

        int min=n1;
        if (n2<min) {
            min=n2;
        }if (n3<min) {
            min=n3;
        }
        System.out.println("The smallest number is : " +min);
    }
}
