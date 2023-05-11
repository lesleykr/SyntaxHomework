package class19HW;

public class Programming {
    String str;
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        this.str=str;
        System.out.println("I love " + str);
    }
}
class ProgrammingTester{
    public static void main(String[] args) {
        Programming noParam=new Programming();
        Programming strParam=new Programming("code");
    }
}
