package class15HW;

public class Students {
    String name;
    int id;
    static int numberOfStudents;

public Students(){
    numberOfStudents++;
}
    public static void main(String[] args) {
        Students student1=new Students();
        Students student2=new Students();
        Students student3=new Students();

        student1.name="Jenny";
        student1.id=1234;

        student2.name="Kevin";
        student2.id=1235;

        student3.name="Angie";
        student3.id=12346;

        System.out.println(Students.numberOfStudents);

    }
}
