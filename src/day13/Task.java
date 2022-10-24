package day13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
                Klavyeden userName ve password bilgisi alınacaktır.
                Eğer her iki veri doğru ise "Yönetim sayfasına hoşgeldiniz" mesajı verilecektir.
                Eğer parola yanlış ise "Yanlış parola girdiniz. Lütfen tekrar deneyiniz." mesajı verilecektir.
                Eğer kullanıcı adı yanlış girilmiş ise "Lütfen sistem yöneticisi ile irtbat kurunuz" mesajı verilecektir.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String userName=input.next();
        System.out.print("Password: ");
        String password=input.next();

        if (userName.equals("kaankaymaz6") & (password.equals("123456")))
            System.out.print("Welcome admin!");
        if (!password.equals("123456"))
            System.out.print("Wrong password! Please try again.");
        if (!userName.equals("kaankaymaz6"))
            System.out.print("Please reach out to admin");
    }
}

