package class19HW;

public class Overload2 {
    String str;
    int num1;
    int num2;
    int num3;
    private void over2(String str){
        System.out.println("I say "+str);
    }
    private void over2(int num1, int num2){
        System.out.println("num1: "+num1+" "+"num2: "+num2);
    }
    private void over2(int num1, int num2, int num3){
        System.out.println("num1: "+num1+" "+"num2: "+num2+" "+"num3: "+num3);
    }
    public static void main(String[] args) {
        Overload2 strTest=new Overload2();
        strTest.over2("Hello");
        Overload2 numTest=new Overload2();
        numTest.over2(3,7);
        Overload2 moreNums=new Overload2();
        moreNums.over2(2,6,4);
    }
}

