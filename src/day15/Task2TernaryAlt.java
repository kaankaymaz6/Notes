package day15;

public class Task2TernaryAlt {
    public static void main(String[] args) {
        //Ternary op.
        int x=90;
        int y=80;
        String message=x>y?"x is bigger.":x<y?"x is smaller.":"both of them are equal.";
        System.out.println(message);
    }
}
