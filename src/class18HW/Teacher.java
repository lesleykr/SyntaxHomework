package class18HW;

public class Teacher {
    String name;
    String subject;
    int yearsExp;
    double salary;
    void speaking(){
        System.out.println("Hello class...");
    }
    void writing(){
        System.out.println("Writing on board...");
            }
    void giveHW(){
        System.out.println("Your homework will be....");
    }
    void giveMarks(){
        System.out.println("grading students' work");
    }
}

class MathTeacher extends Teacher{

}

class ChemistryTeacher extends Teacher{

}

class PianoTeacher extends Teacher{

}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        ChemistryTeacher chemistry=new ChemistryTeacher();
        PianoTeacher piano=new PianoTeacher();

        math.name="Bruce";
        chemistry.name="Adam";
        piano.name="Louise";

        math.subject="math";
        chemistry.yearsExp=5;
        piano.salary=40000.00;

        math.giveHW();
        chemistry.giveHW();
        piano.giveHW();

        math.giveMarks();
        chemistry.speaking();
        piano.writing();

    }
}