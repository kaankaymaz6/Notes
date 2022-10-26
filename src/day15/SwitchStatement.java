package day15;

public class SwitchStatement {
    public static void main(String[] args) {
        int choice=7;
        switch (choice){
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;
        }
        //break imleci buraya getirir.
        System.out.println("out of Switch.");
    }
}
