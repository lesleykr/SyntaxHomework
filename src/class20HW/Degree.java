package class20HW;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {
}

class Masters extends Degree {
    void getPrerequisite() {
        System.out.println("Congrats, grad!");
    }
}

class DegreeTester {
    public static void main(String[] args) {
        Degree grad1 = new Degree();
        Bachelors grad2 = new Bachelors();
        Masters grad3 = new Masters();

        grad1.getPrerequisite();
        grad2.getPrerequisite();
        grad3.getPrerequisite();
    }
}
