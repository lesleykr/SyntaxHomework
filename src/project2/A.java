package project2;

public class A extends Marks{
    double mathMark;
    double engMark;
    double chemMark;
  A(double mathMark, double engMark, double chemMark){
        this.mathMark=mathMark;
        this.engMark=engMark;
        this.chemMark=chemMark;
    }
    @Override
    public double getPercentage(){
        return (mathMark+engMark+chemMark)/3;
    }
}
