package class13HW;

public class Swap {
    public static void main(String[] args) {
        String word1="cat";
        String word2="rabbit";
        System.out.println("Original: " + word1 + " " + word2);
        word1=word1+" "+word2;
        word2=word1.substring(0,word1.indexOf(" "));
        word1=word1.substring(word1.indexOf(" "), word1.length());

        System.out.println("Swapped: " + word1 +" " + word2);

    }
}
