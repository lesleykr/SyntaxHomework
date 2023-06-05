package class25HW;

import class25HW.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {
    public static void main(String[] args) {
        Student stu1=new class25HW.Student("Jasmine", 1234);
        Student stu2=new class25HW.Student("Kevin", 2345);
        Student stu3=new class25HW.Student("Jose", 3456);
        Student stu4=new class25HW.Student("April", 4567);

        Set<Student> students=new HashSet<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        for(Student s:students){
            System.out.println(s.getName());
        }

    }
}
