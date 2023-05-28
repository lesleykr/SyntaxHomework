package class25HW;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {

        Car prius=new Car();
        Car niro=new Car();
        Car civic=new Car();
        Pet cat=new Pet();
        Pet dog=new Pet();
        Pet fish=new Pet();
        Health kid1=new Health();
        Health kid2=new Health();
        Health kid3=new Health();

        ArrayList<Car> insuredCars=new ArrayList<>();
        insuredCars.add(prius);
        insuredCars.add(niro);
        insuredCars.add(civic);

        ArrayList<Pet> insuredPets=new ArrayList<>();
        insuredPets.add(cat);
        insuredPets.add(dog);
        insuredPets.add(fish);

        ArrayList<Health> insuredHealth=new ArrayList<>();
        insuredHealth.add(kid1);
        insuredHealth.add(kid2);
        insuredHealth.add(kid3);

        for(Car i:insuredCars){
            System.out.println(i.getQuote());
            System.out.println(i.cancelInsurance());
            System.out.println(i.getCarModel());
        }
for(Pet i:insuredPets){
    System.out.println(i.getQuote());
    System.out.println(i.cancelInsurance());
    System.out.println(i.petType);
        }

for(Health i:insuredHealth){
    System.out.println(i.getQuote());
    System.out.println(i.cancelInsurance());
}
    }
}
