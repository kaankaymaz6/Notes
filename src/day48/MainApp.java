package day48;

public class MainApp {
    public static void main(String[] args) {
        /*
                1. Keywords: try-catch-finally-throw-throws
                2. Classes: Exception-NullPointerException-ArrayIndexOutOfBoundsException-...
                3. Hata Durumları:
                    a. Erros: Sistem hataları
                    b. Exceptions:
                        1. Checked Exceptions: Compile-Design Time Exceptions
                        2. Unchecked Exceptions: Runtime Exceptions
         */

        try {
            Kare k=new Kare(-7);
        }catch (LengthException e){
            e.printStackTrace();
        }
    }
}
