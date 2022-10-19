package day11;

public class Circle {
    public static void main(String[] args) {
        double r1=7.0;
        System.out.printf("Area = %5.2f\n",areaCalculate(r1));
        System.out.printf("Perimeter = %5.2f\n ",perimeterCalculate(r1));
    }

    public static double areaCalculate(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double perimeterCalculate(double radius){
        return 2*Math.PI*radius;
    }
}
