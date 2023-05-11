package class19HW;

public class Overload {
    /*static String str;
    static int num1;
    static int num2;
    static int num3;*/
    static void over(String str){
        System.out.println("I say "+str);
    }
   static void over(int num1,int num2){
        System.out.println("Nums: "+num1+", "+num2);
    }
    static void over(int num1, int num2, int num3){
        System.out.println("Still more nums: "+num1+", "+num2+", "+num3);
    }
    public static void main(String[] args) {
        Overload str1=new Overload();


    }
}

