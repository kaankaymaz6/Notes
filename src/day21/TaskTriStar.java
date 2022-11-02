package day21;

public class TaskTriStar {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
