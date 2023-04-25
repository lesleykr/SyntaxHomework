package class13HW;

public class Palindrome {
    public static void main(String[] args) {

        String check="never odd or even";
        check=check.trim().toLowerCase().replace(" ","");
        StringBuilder rev=new StringBuilder(check);
        String check2=rev.reverse().toString().trim().toLowerCase().replace(" ","");

        String res=(check.equals(check2))?"true":"false";

        System.out.println(res);

    }
}
