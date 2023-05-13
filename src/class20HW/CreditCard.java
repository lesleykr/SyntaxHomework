package class20HW;

public class CreditCard {
    double balance;
    double interest;

    void calcInterest(double balance, double interest) {
        double res = balance * interest;
        System.out.println(res);
    }
}

class Visa extends CreditCard {
}

class AX extends CreditCard {
    void calcInterest() {
        System.out.println("No interest payment!");
    }
}

class CCTester {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        Visa card2 = new Visa();
        AX card3 = new AX();

        card1.calcInterest(5000, .07);
        card2.calcInterest(100000, .04);
        card3.calcInterest();
    }
}
