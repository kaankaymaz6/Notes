package day14;

public class Homework {
    public static void main(String[] args) {
        int n1=10;
        int n2=12;
        System.out.println("First number: "+n1);
        System.out.println("Second number: "+n2);
        int c=n2;
        n2=n1;
        n1=c;
        System.out.println("First number changed: "+n1);
        System.out.println("Second number changed: "+n2);
    }
}
