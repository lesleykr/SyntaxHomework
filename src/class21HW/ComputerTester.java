package class21HW;

public class ComputerTester {
    public static void main(String[] args) {
        Apple apple1=new Apple();
        Lenovo lenovo1=new Lenovo();
        HP hp1=new HP();
        Dell dell1=new Dell();
        Computer apple2=new Apple();

        Computer[] arr1={apple1,lenovo1,hp1,dell1,apple2};

        for(Computer item:arr1){
            item.boot();
            item.reboot();
            item.blueScreen();

        }
        apple1.startFaceTime();
        lenovo1.openXPower();
        hp1.openHPSmart();
        dell1.dellUpdate();
    }
}
