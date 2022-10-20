package day12.ifpack;

public class IfExample {
    public static void main(String[] args) {
        int age=70;

        if(age<6){
            System.out.println("Hi baby!");
        } else if (age < 13) {
            System.out.println("Hi kid!");
        } else if (age <= 18) {
            System.out.println("Hi teenager!");
        } else if (age < 40) {
            System.out.println("Hi person!");
        } else if (age < 60) {
            System.out.println("Hi!");
        } else {
            System.out.println("Hi granny!");
        }
    }
}
