package class14HW;

import java.util.Scanner;

public class languages {
    void hello(String lang){

        switch (lang){
            case "english":
                System.out.println("Hello");
                break;
            case "spanish":
                System.out.println("Hola");
                break;
            case "french":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Language Unknown");
        }

    }

    public static void main(String[] args) {
        languages lang1=new languages();

       lang1.hello("french");
    }

}
