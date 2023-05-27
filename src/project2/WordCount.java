package project2;

public class WordCount{
    public static void main(String[] args) {
       var str="Hello, how are you/yew?";

        var wordCount=str.split("\\s|/").length;
        System.out.println(wordCount);
    }
}
