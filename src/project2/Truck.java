package project2;

public class Truck extends Car {
    double weight;
Truck(double carPrice, double weight){
    super(carPrice);
    this.weight=weight;
}
    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return carPrice-(carPrice*0.1);
        }else{
            return carPrice-(carPrice*0.2);
        }
    }
}
