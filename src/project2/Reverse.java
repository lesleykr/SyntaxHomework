package project2;

public class Reverse {

    public static void main(String[] args) {
        String str="hello";
        String res="";
        for (int i =0; i<str.length() ; i++) {
            res=str.charAt(i)+res;
        }
        System.out.println(res);

   //OR

        StringBuilder strB=new StringBuilder(str);
        strB.reverse().toString();
        System.out.println(strB);


    }
}
