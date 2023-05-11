package class17HW;

public class Students {
   String name;
   int mathGrade;
   int scienceGrade;
   int englishGrade;
    Students(String name, int mathGrade, int scienceGrade, int englishGrade){
        this.name=name;
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.englishGrade=englishGrade;
    }
    void avgGrade(){

        int avg=(mathGrade+scienceGrade+englishGrade)/3;
        System.out.println("Student Name: "+name+", Average: "+avg);
    }
}
class StudentsTest{
    public static void main(String[] args) {
        Students stu1=new Students("Jenny", 80, 88, 93);
        Students stu2=new Students("Frank",75, 82, 87);
        Students stu3=new Students("Jack", 91,95,98);
        Students stu4=new Students("Andy", 86,93,75);
        Students stu5=new Students("Angie", 94, 87, 92);

        stu1.avgGrade();
        stu2.avgGrade();
        stu3.avgGrade();
        stu4.avgGrade();
        stu5.avgGrade();
    }
}