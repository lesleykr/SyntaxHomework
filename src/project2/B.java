package project2;

public class B extends Marks{
    double mathMark;
    double engMark;
    double chemMark;
    double artMark;
    B(double mathMark, double engMark, double chemMark, double artMark){
        this.mathMark=mathMark;
        this.engMark=engMark;
        this.chemMark=chemMark;
        this.artMark=artMark;
    }

    public double getPercentage(){
        return(mathMark+engMark+chemMark+artMark)/4;
    }
}
