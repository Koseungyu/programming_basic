import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Bus bus1 = new Bus(random.nextInt(31),11,70);
        int busid = bus1.id;

        System.out.println("----------------------------------------");
        System.out.println("해당 버스는 "+busid+"번 입니다.");
        bus1.turnOnOff();
        bus1.fuel();
        if(bus1.oil<10){
            return;
        }
        bus1.passenger(30);
        bus1.lowSpeed(50);
        bus1.highSpeed(50);
        bus1.turnOnOff();
        System.out.println("----------------------------------------");

        Taxi taxi1 = new Taxi(random.nextInt(31),11,50);
        int taxiid = taxi1.id;
        System.out.println("해당 택시는 "+taxiid+"번 입니다.");
        taxi1.turnOnOff();
        taxi1.manInOut();
        taxi1.fuel();
        if(taxi1.oil<10){
            return;
        }
        taxi1.lowSpeed(20);
        taxi1.highSpeed(70);
        taxi1.pay(3000,25,10,150);
        taxi1.turnOnOff();

        System.out.println("----------------------------------------");

    }
}
