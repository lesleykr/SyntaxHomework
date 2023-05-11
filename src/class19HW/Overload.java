package class19HW;

public class Overload {
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
    over("Meep");
    over(4,5);
    over(1,2,3);
    }
}

