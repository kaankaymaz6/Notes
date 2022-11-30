package day40;

public class MainApp {
    public static void main(String[] args) {
        //concat
        //Task: ad ve soyad usulüne uygun şekilde birleştirilip, büyük karakterli olarak yazdıralacaktır.
        String str1="Ahmet";
        String str2="Dursun";
        String isim=str1.concat(" ").concat(str2).toUpperCase();
        System.out.println(isim);
        System.out.println((str1+" "+str2).toUpperCase());
        System.out.printf("%s %s \n".toUpperCase(),str1,str2);
        System.out.println(String.format("%s %s",str1,str2).toUpperCase());
    }
}
