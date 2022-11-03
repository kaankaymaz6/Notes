package day22;

public class WhileTag {
    public static void main(String[] args) {
        Tag1:
        while (true){
            System.out.println("Hello");
            if (true){
                break Tag1;
            }
        }
    }
}
