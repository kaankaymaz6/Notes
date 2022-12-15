package day51;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        int[] dizi={1,2,5,7};
        for (var item:dizi){

        }

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        for (var item:numbers){
            System.out.println(item);
        }
        ShowRoom showRoom=new ShowRoom();
        System.out.println("Capacity : "+showRoom.capacity());
        System.out.println("Size : "+showRoom.size());

        showRoom.add(new Car(1,"Araba 1"));
        showRoom.add(new Car(2,"Araba 2"));
        showRoom.add(new Car(2,"Araba 3"));
        showRoom.add(new Car(2,"Araba 4"));
        showRoom.add(new Car(2,"Araba 5"));
        showRoom.add(new Car(2,"Araba 6"));

        System.out.println("Capacity : "+showRoom.capacity());
        System.out.println("Size : "+showRoom.size());

        showRoom.add(new Car(2,"Araba 7"));
        showRoom.add(new Car(2,"Araba 8"));
        showRoom.add(new Car(2,"Araba 9"));
        showRoom.add(new Car(2,"Araba 10"));
        showRoom.add(new Car(2,"Araba 11"));

        System.out.println("Capacity : "+showRoom.capacity());
        System.out.println("Size : "+showRoom.size());

//        for (var item:showRoom){
//
//        }

    }
}
