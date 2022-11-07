package day24;

public class Dog {
    public String type;
    public int age;
    public double weight;

    public void showInfo(){
        System.out.printf("Type : %s [Age : %d - Weight : %5.1f Kg.]",type,age,weight);
    }
}
