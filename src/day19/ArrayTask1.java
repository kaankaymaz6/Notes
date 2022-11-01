package day19;

public class ArrayTask1 {
    public static void main(String[] args) {
        /*
        Array Task 1

        Store grades of twelve students in an integer array variable. Write a Java program
        that finds the average of these grades.

        grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45
         */
        int[] grades = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
            int sum = 0;
            for( int i= 0; i < grades.length; i++) {
                sum += grades[i];
            }System.out.println("Average of the grades : "+sum/grades.length);
    }
}
