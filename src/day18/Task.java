package day18;

import java.util.Locale;
import java.util.Scanner;

public class Task {
    public class Task1 {

        /*
         * Klavyeden veri okumak üzere aşağıdaki istenenleri gerçekleştiriniz.
         * Matematik işlemleri
         * Alan ve Çevre Hesaplamarı
         * Çıkış
         *
         * Alt Menü | Matematik İşlemleri
         * Faktoriyel Hesaplama
         * Mutlak Değer Alma
         * Çıkış
         *
         * Alt Menü | Alan ve Çevre Hesaplama
         * Dikdörtgen
         * Kare
         * Daire
         * Çıkış
         * */


//        Scanner input = new Scanner(System.in);
//        System.out.println("Seciminiz: ");
//        int sayi=input.nextInt();

        public static void main(String[] args) {
            String secim = showMainMenu().toUpperCase(Locale.ROOT);
            switch (secim) {
                case "1":
                    String mathSecim = showSubMenuMath().toUpperCase();
                    if (mathSecim.equals("1")) {
//                    Faktoriyel Hesaplama
                        System.out.print("Faktoriyeli hesaplanacak sayi: ");
                        System.out.println("Sonuc = " + factoriyel(new Scanner(System.in).nextInt()));
                    } else if (mathSecim.equals("2")) {
//                    Mutlak Değer Alma
                        System.out.print("Mutlak degeri hesaplanacak sayi: ");
                        int sayi = new Scanner(System.in).nextInt();
//                    System.out.printf("Sonuc = %d", sayi>=0?sayi:-sayi);
//                    System.out.printf("Sonuc = %d", Math.abs(sayi));
                        System.out.printf("Sonuc=%5d", mutlakDeger(sayi));

                        System.out.println();
                    } else if (mathSecim.equals("Q")) {
//                    Çıkış
                        System.out.println("Programdan cikildi.");
                    } else {
                        System.out.println("Yanlis secim yaptiniz.");
                    }
                    break;
                case "2":
                    String geoSecim = showSubMenuArea().toUpperCase();
                    switch (geoSecim) {
                        case "1":
//                        Dikdörtgen
                            System.out.println("Dikdortgen icin; ");
                            System.out.print("Uzun Kenar = ");
                            int uKenar = new Scanner(System.in).nextInt();
                            System.out.print("Kisa Kenar = ");
                            int kKenar = new Scanner(System.in).nextInt();
//                        System.out.printf("Alan = %5d\n",kKenar*uKenar);
//                        System.out.printf("Cevre = %5d", 2*(kKenar+uKenar));
                            System.out.printf("Cevre = %5d \n", cevreHesapla(uKenar, kKenar));
                            System.out.printf("Alan = %5d \n", alanHesapla(uKenar, kKenar));
                            break;

                        case "2":
//                    Kare
                            System.out.println("Kare icin; ");
                            System.out.print("Kenar Bilgisi = ");
                            int kenar = new Scanner(System.in).nextInt();
                            System.out.printf("Alan = %d\n", kenar * kenar);
                            System.out.printf("Cevre = %d", 2 * (kenar + kenar));

                            break;

                        case "3":
//                    Daire
                            System.out.println("Daire icin;");
                            System.out.print("Yaricap bilgisi giriniz: ");
                            double yaricap = new Scanner(System.in).nextDouble();
                            System.out.printf("Alan = %5.2f\n", (Math.PI * yaricap * yaricap));
                            System.out.printf("Cevre = %5.2f\n", 2 * yaricap * Math.PI);

                            break;

                        case "Q":
                            System.out.println("Programdan cikildi.");
                            break;

                        default:
                            System.out.println("Hatali secim yaptiniz.");
                            break;
                    }
                    break;
                case "Q":
                    System.out.println("Programdan cikildi.");
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz.");
                    break;
            }


        }

        private static int alanHesapla(int uK, int kK) {
            return uK * kK;
        }

        private static int cevreHesapla(int uKenar, int kKenar) {
            return 2 * (kKenar + uKenar);
        }

        public static String showMainMenu() {
            System.out.println("Ana Menu");
            System.out.println("1. Matematik Islemleri");
            System.out.println("2. Alan ve Cevre Hesaplamalari");
            System.out.println("Q. Quit");
            System.out.print("Seciminiz: ");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            return choice;

        }

        public static String showSubMenuMath() {
            System.out.println("Alt Menu | Matematik Islemleri");
            System.out.println("1. Faktoriyel Hesaplama");
            System.out.println("2. Mutlak Deger Alma");
            System.out.println("Q. Quit");
            System.out.print("Seciminiz: ");
//        Scanner input=new Scanner(System.in);
//        String choice=input.nextLine();
//        return choice;
            return new Scanner(System.in).nextLine();
        }

        public static String showSubMenuArea() {
            System.out.println("Alt Menu | Alan ve Cevre Hesaplama");
            System.out.println("1. Dikdortgen");
            System.out.println("2. Kare");
            System.out.println("3. Daire");
            System.out.println("Q. Quit");
            System.out.print("Seciminiz: ");
            return new Scanner(System.in).nextLine();
        }

        public static int factoriyel(int deger) {
            if (deger < 2) return 1;

            int carpim = 1;
            for (int i = 2; i <= deger; i++) {
                carpim *= i;

            }
            return carpim;
        }

        public static int mutlakDeger(int deger) {
            return deger >= 0 ? deger : -deger;
        }
    }
}
