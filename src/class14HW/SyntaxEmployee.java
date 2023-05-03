package class14HW;

public class SyntaxEmployee {
    String empID;
    double salary;
    static String cEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID="1234";
        emp1.salary=50000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID="4321";
        emp2.salary=65000;
        System.out.println("Emp1: "+emp1.empID+ " "+emp1.salary +" "+SyntaxEmployee.cEO);
        System.out.println("Emp2: "+emp2.empID + " " + emp2.salary + " "+ SyntaxEmployee.cEO);
    }
}
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */