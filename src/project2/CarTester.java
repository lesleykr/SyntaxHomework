package project2;

public class CarTester {
    public static void main(String[] args) {
        Truck truck1=new Truck(40000,3000);
        System.out.println("Truck sale price: "+truck1.calculateSalePrice());

        Sedan sedan1=new Sedan(30000,18);
        System.out.println("Sedan sale price: "+sedan1.calculateSalePrice());
    }
}
