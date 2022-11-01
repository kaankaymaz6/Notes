package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //YÖNTEM 1
//        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

        //YÖNTEM 2
//        String[] months=new String[12];
//        months[0]="January";
//        months[1]="February";
//        months[2]="March";
//        months[3]="April";
//        months[4]="May";
//        months[5]="June";
//        months[6]="July";
//        months[8]="August";
//        months[9]="September";
//        months[10]="October";
//        months[11]="November";
//        months[12]="December";

        //YÖNTEM 3
//        String[] months;
//        months=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.print("Which month did you choose? [1-12] : ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        if (option > 0 & option <= 12) {
            System.out.printf("Chosen month : %s", months[option - 1]);
        }else {
            System.out.println("Wrong choice!");
        }
    }
}
