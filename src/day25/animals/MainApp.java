package day25.animals;

public class MainApp {
    public static void main(String[] args) {
        Cat ra=new Cat();
        ra.type="Scottish";
        ra.age=2;
        ra.weight=2.3;

        Lion l1=new Lion();
        l1.height=2.5;
        l1.weight=150.0;
        l1.type="Wildlife";
        l1.gender="Male";
        l1.color="Brown";

        Lion l2=new Lion();
        l2.height=2.4;
        l2.weight=130.0;
        l2.type="Cave";
        l2.gender="Female";
        l2.color="Yellow";
    }
}
