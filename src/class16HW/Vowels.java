package class16HW;

public class Vowels {
   private static String vowelsOnly(String str){
     String strRes=str.replaceAll("[^aeiou]", "");
     return strRes;
    }
    public static void main(String[] args) {
        System.out.println(vowelsOnly("accessible"));
    }
}
