package project2;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String word1="silent";
        String word2="listen";
        var count=0;

       char[] arr1=word1.toCharArray();
       char[] arr2=word2.toCharArray();
      Arrays.sort(arr1);
        Arrays.sort(arr2);
       if(arr1.length==arr2.length) {
           for (int i = 0; i < arr1.length; i++) {
               if (arr1[i] != (arr2[i])) {
                   count++;
               }
           }
           if (count == 0) {
               System.out.println("The words are anagrams");
           } else {
               System.out.println("The words are not anagrams");
           }
       }else{
           System.out.println("The words are not anagrams");
       }
    }
}
