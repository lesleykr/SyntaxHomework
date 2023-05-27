package project2;

public class MarksTester {
    public static void main(String[] args) {
        A stuA=new A(75,90,87);
        System.out.println("Student A's average: "+stuA.getPercentage());

        B stuB=new B(85,97,80,93);
        System.out.println("Student B's average: "+stuB.getPercentage());
    }
}
