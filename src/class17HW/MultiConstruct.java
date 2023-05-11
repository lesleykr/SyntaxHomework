package class17HW;

public class MultiConstruct {
    String str;
    int num1;
    int num2;
    int num3;

    private MultiConstruct(String str){
        System.out.println("Private Constructor");
    }

    public MultiConstruct(String str, int num1){
        System.out.println("Public Constructor");
    }
    MultiConstruct(int num1, int num2){
        System.out.println("Default Constructor");
    }

    protected MultiConstruct(int num1, String str){
        System.out.println("Protected Constructor");
    }

    public static void main(String[] args) {

    }
}
