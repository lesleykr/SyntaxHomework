package project2;

class Sedan extends Car {
    double length;
    Sedan(double carPrice, double length){
        super(carPrice);
        this.length=length;
    }
    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice-(carPrice*0.05);
        }else{
            return carPrice-(carPrice*0.1);
        }
    }
}
