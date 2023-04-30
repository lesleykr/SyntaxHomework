package class13HW;

public class Palindrome {

    boolean isPalindrome(String str){
        String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome=false;
       if(str.equalsIgnoreCase(reversedStr)){
           isStrPalindrome=true;
       }return isStrPalindrome;
    }

    public static void main(String[] args) {
Palindrome test1=new Palindrome();
boolean result=test1.isPalindrome("madam");
        System.out.println(result);


        String check="never odd or even";
        check=check.trim().toLowerCase().replace(" ","");
        StringBuilder rev=new StringBuilder(check);
        String check2=rev.reverse().toString().trim().toLowerCase().replace(" ","");

        String res=(check.equals(check2))?"true":"false";

        System.out.println(res);

    }
}
