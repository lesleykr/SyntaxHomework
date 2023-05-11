package class16HW;

public class Reversal {
    String reverseStr(String str){
        StringBuilder strBuild=new StringBuilder(str);
       return strBuild.reverse().toString();
       }
}
class ReversalTester{
    public static void main(String[] args) {
        Reversal reversed=new Reversal();
        System.out.println(reversed.reverseStr("fruit"));
    }
}

