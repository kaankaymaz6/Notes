package day48;

public class LengthException extends Exception{
    public LengthException() {
        super("Uzunluk değeri negatif bir değer olamaz.");
    }
}
