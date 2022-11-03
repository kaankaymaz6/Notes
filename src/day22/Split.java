package day22;

public class Split {
    public static void main(String[] args) {
        String sentence="Video, gives you an option to prove yourself.";
        String[] words=sentence.split(" ");
        for (String word:words){
            System.out.println(word);
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println();
        int counter=0;
        while (counter< words.length){
            System.out.println(words[counter++]);
        }
    }
}
