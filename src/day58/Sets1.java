package day58;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets1 {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.addAll(List.of(
                new Car(1, "Toyata", 500),
                new Car(2, "Honda", 550),
                new Car(3, "BMW", 750)
        ));
        cars.forEach(System.out::println);
    }
}
record Car(int id,String name, double price){}