package project2;

import org.w3c.dom.ls.LSOutput;

public class Palindrome {
    public static void main(String[] args) {
        var pal="racecar";
        var check=0;

        for(int i=0; i<pal.length(); i++){
           char chF=pal.charAt(i);
           char chB=pal.charAt((pal.length()-1)-i);
           if(chF!=chB){
               check++;
           }
        }
       if(check == 0){
           System.out.println("The word is a palindrome");
       } else {
           System.out.println("The word is not a palindrome");
       }
    }
}
